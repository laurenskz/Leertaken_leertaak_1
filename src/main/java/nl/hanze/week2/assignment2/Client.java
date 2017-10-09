package nl.hanze.week2.assignment2;

import java.lang.*;

/**
 * Created by Laurens on 9-10-2017.
 */
public class Client {

    public static void main(String[] args) {
        Food spaghetti = new Food();
        FoodEater foodEater = new FoodEater(spaghetti);
        new Thread(foodEater).start();
    }
}
