package nl.hanze.week1.assignment1.observers;

import nl.hanze.week1.assignment1.Observer;
import nl.hanze.week1.assignment1.Stock;
import nl.hanze.week1.assignment1.StockGrabber;
import nl.hanze.week1.assignment1.View;

/**
 * Created by Laurens on 25-9-2017.
 */
public class IBMObserver extends BaseObserver implements Observer {

    private double ibmPrice;
    private StockGrabber stockGrabber;
    private View view;

    public IBMObserver(StockGrabber stockGrabber) {
        stockGrabber.register(this);
        this.stockGrabber = stockGrabber;
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        updateViews(Stock.IBM, ibmPrice);
    }
}
