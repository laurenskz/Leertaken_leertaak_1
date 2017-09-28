package nl.hanze.assignment1


import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Node
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent
import javafx.scene.layout.FlowPane
import javafx.scene.layout.Pane
import javafx.scene.layout.StackPane
import javafx.stage.Stage
import nl.hanze.assignment1.observers.AAPLObserver
import nl.hanze.assignment1.observers.BaseObserver
import nl.hanze.assignment1.observers.GoogleObserver
import nl.hanze.assignment1.observers.IBMObserver
import nl.hanze.assignment1.view.GraphView
import nl.hanze.assignment1.view.TextView
import java.util.*


// the Client
class StockApp : Application() {

    private lateinit var graphView: View
    private lateinit var textView: View
    private lateinit var viewPane: Pane

    private fun Button.onClick(eventHandler: (MouseEvent) -> Unit) = apply {
        onMouseClicked = EventHandler<MouseEvent>(eventHandler)
    }

    private fun Stage.showScene(width: Number = -1, height: Number = -1, generator: () -> Parent) {
        scene = Scene(generator(), width.toDouble(), height.toDouble())
        show()
    }

    private fun flowPane(init: FlowPane.() -> Unit = {}) = FlowPane().also(init)
    private fun FlowPane.button(name: String, init: Button.() -> Unit = {}) = Button(name).also(init).also { children += it }
    inline fun <reified R : Node> FlowPane.add() = R::class.java.newInstance().also { children += it }

    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        val stockGrabber = StockGrabber()
        spawnPriceGenerationThreads(stockGrabber)
        graphView = GraphView()
        textView = TextView()
        createObservers(stockGrabber)

        primaryStage.showScene(300, 256) {
            flowPane {
                button("text").onClick {
                    viewPane.children.setAll(textView.node)
                }
                button("Graph").onClick {
                    viewPane.children.setAll(graphView.node)
                }
                viewPane = add<StackPane>()
            }
        }
    }

    private fun createObservers(stockGrabber: StockGrabber) {
        val aaplObserver = AAPLObserver(stockGrabber)
        val googleObserver = GoogleObserver(stockGrabber)
        val ibmObserver = IBMObserver(stockGrabber)
        Arrays.asList<BaseObserver>(aaplObserver, googleObserver, ibmObserver)
                .forEach { observer ->
                    observer.addView(textView)
                    observer.addView(graphView)
                }
    }


    companion object {
        private fun spawnPriceGenerationThreads(stockGrabber: StockGrabber) = Stock.values().asSequence()
                .map { GetTheStock(stockGrabber, it) }
                .map(::Thread)
                .forEach { it.start() }
    }
}

fun main(args: Array<String>) = Application.launch(StockApp::class.java, *args)