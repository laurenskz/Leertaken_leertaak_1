package nl.hanze.assignment1.observers;

import nl.hanze.assignment1.Observer;
import nl.hanze.assignment1.Stock;
import nl.hanze.assignment1.StockGrabber;

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
