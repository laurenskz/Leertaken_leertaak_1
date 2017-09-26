package nl.hanze.assignment1.view;

import javafx.application.Platform;
import javafx.scene.text.Text;
import nl.hanze.assignment1.Stock;
import nl.hanze.assignment1.View;

import javafx.scene.Node;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by Laurens on 25-9-2017.
 */
public class TextView implements View {

    private Text text = new Text();
    private Map<Stock, Double> prices = new ConcurrentHashMap<>();

    @Override
    public Node getNode() {
        return text;
    }

    @Override
    public void update(Stock stock, double newPrice) {
        prices.put(stock, newPrice);
        Platform.runLater(this::updateText);
    }

    private void updateText() {
        String newText = prices.keySet()
                .stream()
                .map(currentStock ->
                        currentStock.getName() + " : " + prices.get(currentStock))
                .collect(Collectors.joining("\n"));
        text.setText(newText);
    }
}
