package nl.hanze.assignment1.view;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import nl.hanze.assignment1.Stock;
import nl.hanze.assignment1.StockUpdate;
import nl.hanze.assignment1.View;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Laurens on 25-9-2017.
 */
public class GraphView implements View {

    private LineChart<Number, Number> lineChart = new LineChart<>(new NumberAxis(), new NumberAxis());
    private Map<Stock, XYChart.Series> stockValues = new HashMap<>();
    private Map<Stock, Integer> counters = new ConcurrentHashMap<>();

    @NotNull @Override
    public Node getNode() {
        return lineChart;
    }

    @Override
    public void update(@NotNull StockUpdate stockUpdate) {
        Stock stock = stockUpdate.getStock();
        Double newPrice = stockUpdate.getPrice();
        assertInitialization(stock);
        XYChart.Series series = stockValues.get(stock);
        counters.merge(stock, 1, Integer::sum);
        Platform.runLater(() -> series.getData().add(new XYChart.Data(counters.get(stock), newPrice)));

    }

    private void assertInitialization(Stock stock) {
        if (!stockValues.containsKey(stock)) {
            XYChart.Series series = new XYChart.Series();
            stockValues.put(stock, series);
            Platform.runLater(() -> lineChart.getData().add(series));
        }
    }
}
