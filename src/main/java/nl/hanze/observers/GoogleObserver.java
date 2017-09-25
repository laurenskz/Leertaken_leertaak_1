package nl.hanze.observers;

import nl.hanze.Observer;
import nl.hanze.Stock;
import nl.hanze.StockGrabber;
import nl.hanze.View;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Laurens on 25-9-2017.
 */
public class GoogleObserver extends BaseObserver implements Observer {

    private double googPrice;
    private StockGrabber stockGrabber;

    public GoogleObserver(StockGrabber stockGrabber) {
        stockGrabber.register(this);
        this.stockGrabber = stockGrabber;
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.googPrice = googPrice;
        updateViews(Stock.GOOGLE, googPrice);
    }
}
