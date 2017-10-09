package nl.hanze.week2.assignment2;

/**
 * Created by Laurens on 9-10-2017.
 */
public class FoodEater implements Runnable{

    private Food food;

    public FoodEater(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        while (food.hasLeft()) {
            food.eatABite();
        }
    }
}
