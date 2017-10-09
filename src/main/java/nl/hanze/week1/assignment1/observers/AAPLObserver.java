package nl.hanze.week1.assignment1.observers;

import nl.hanze.week1.assignment1.Observer;
import nl.hanze.week1.assignment1.Stock;
import nl.hanze.week1.assignment1.StockGrabber;

/**
 * Created by Laurens on 25-9-2017.
 */
public class AAPLObserver extends BaseObserver implements Observer {

    private double aaplPrice;
    private StockGrabber stockGrabber;

    public AAPLObserver(StockGrabber stockGrabber) {
        stockGrabber.register(this);
        this.stockGrabber = stockGrabber;
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.aaplPrice = aaplPrice;
        updateViews(Stock.AAPL, aaplPrice);
    }
}
