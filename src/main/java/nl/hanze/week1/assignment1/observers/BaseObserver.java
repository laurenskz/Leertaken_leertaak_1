package nl.hanze.week1.assignment1.observers;

import nl.hanze.week1.assignment1.Stock;
import nl.hanze.week1.assignment1.View;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Laurens on 25-9-2017.
 */
public class BaseObserver {

    private Collection<View> views = new ArrayList<>();

    public void addView(View view) {
        views.add(view);
    }

    public void removeView(View view) {
        views.remove(view);
    }

    public void updateViews(Stock stock, double price) {
        views.forEach(view -> view.update(stock, price));
    }
}
