package nl.hanze.week2.assignment3;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Laurens on 9-10-2017.
 */
public abstract class PizzaMaker {

    protected abstract String getBase();

    protected abstract Collection<String> getToppings();

    public final Pizza createPizza() {
        String base = getBase();
        base = putInOven(base);
        Collection<String> toppings = getToppings();
        List<String> nonDeadlyToppings = toppings.stream()
                .filter(topping -> !isPoisonous(topping))
                .collect(Collectors.toList());
        return new Pizza(base, nonDeadlyToppings);
    }

    private boolean isPoisonous(String topping) {
        return topping.contains("acid");
    }

    private String putInOven(String base) {
        base = "Baked " + base;
        return base;
    }

}
