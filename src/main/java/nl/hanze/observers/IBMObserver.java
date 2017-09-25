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
