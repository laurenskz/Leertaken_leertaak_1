package nl.hanze.week1.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;

import static java.util.concurrent.Executors.newSingleThreadScheduledExecutor;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Laurens on 25-9-2017.
 */
public class GetTheStock implements Runnable {

    public static final double STD_DEV = 0.05;
    public static final int MEAN = 1;
    private StockGrabber stockGrabber;
    private double price;
    private Stock stock;
    private static final Map<Stock, BiConsumer<StockGrabber, Double>> SETTERS = new HashMap<Stock, BiConsumer<StockGrabber, Double>>() {{
        put(Stock.IBM, StockGrabber::setIBMPrice);
        put(Stock.AAPL, StockGrabber::setAAPLPrice);
        put(Stock.GOOGLE, StockGrabber::setGOOGPrice);
    }};

    public GetTheStock(StockGrabber stockGrabber, Stock stock) {
        this.stockGrabber = stockGrabber;
        this.stock = stock;
        this.price = stock.getInitialPrice();
    }

    @Override
    public void run() {
        newSingleThreadScheduledExecutor().scheduleAtFixedRate(this::setPrice, 0, 2, SECONDS);
    }

    private void setPrice() {
        price *= new Random().nextGaussian() * STD_DEV + MEAN;
        SETTERS.get(stock).accept(stockGrabber, price);
    }
}
