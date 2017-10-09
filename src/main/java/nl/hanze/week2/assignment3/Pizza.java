package nl.hanze.week2.assignment3;

import java.util.Collection;

/**
 * Created by Laurens on 9-10-2017.
 */
public class Pizza {

    private String base;
    private Collection<String> toppings;

    public Pizza(String base, Collection<String> toppings) {
        this.base = base;
        this.toppings = toppings;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Collection<String> getToppings() {
        return toppings;
    }

    public void setToppings(Collection<String> toppings) {
        this.toppings = toppings;
    }
}
