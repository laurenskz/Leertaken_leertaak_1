package nl.hanze;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import nl.hanze.observers.AAPLObserver;
import nl.hanze.observers.GoogleObserver;
import nl.hanze.observers.IBMObserver;
import nl.hanze.view.GraphView;
import nl.hanze.view.TextView;

import java.util.Arrays;
import java.util.stream.Stream;


// the Client
public class StockApp extends Application {

    private View graphView;
    private View textView;
    private Pane root;
    private Pane viewPane;
    private Button textButton;
    private Button graphButton;

    public static void main(String[] args) {
        launch(args);
    }

    private static void spawnPriceGenerationThreads(StockGrabber stockGrabber) {
        Arrays.stream(Stock.values())
                .map(name -> new GetTheStock(stockGrabber, name))
                .map(Thread::new)
                .forEach(Thread::start);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StockGrabber stockGrabber = new StockGrabber();
        spawnPriceGenerationThreads(stockGrabber);
        graphView = new GraphView();
        textView = new TextView();
        createObservers(stockGrabber);
        root = new FlowPane();
        viewPane = new StackPane();
        createButtons();
        showView(primaryStage);
    }

    private void showView(Stage primaryStage) {
        root.getChildren().add(textButton);
        root.getChildren().add(graphButton);
        root.getChildren().add(viewPane);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    private void createObservers(StockGrabber stockGrabber) {
        AAPLObserver aaplObserver = new AAPLObserver(stockGrabber);
        GoogleObserver googleObserver = new GoogleObserver(stockGrabber);
        IBMObserver ibmObserver = new IBMObserver(stockGrabber);
        Arrays.asList(aaplObserver,googleObserver,ibmObserver)
                .forEach(observer ->{
                    observer.addView(textView);
                    observer.addView(graphView);
                });
    }

    private void createButtons() {
        textButton = new Button("Text");
        graphButton = new Button("Graph");
        textButton.setOnMouseClicked(t -> {
            viewPane.getChildren().clear();
            viewPane.getChildren().add(textView.getNode());
        });
        graphButton.setOnMouseClicked(t ->{
            viewPane.getChildren().clear();
            viewPane.getChildren().add(graphView.getNode());
        });
    }
}

