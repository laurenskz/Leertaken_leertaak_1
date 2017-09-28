package nl.hanze.assignment1.view

import javafx.application.Platform
import javafx.scene.text.Text
import nl.hanze.assignment1.StockUpdate
import nl.hanze.assignment1.View
import java.util.concurrent.ConcurrentLinkedDeque

/**
 * Created by Laurens on 25-9-2017.
 */
class TextView : View {

    private val prices = ConcurrentLinkedDeque<StockUpdate>()

    override val node = Text()

    override fun update(stockUpdate: StockUpdate) {
        prices+= stockUpdate
        Platform.runLater {
            node.text = prices.joinToString("\n") { (stock, price) -> "$stock : $price" }
        }
    }
}
