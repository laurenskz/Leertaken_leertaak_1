package nl.hanze.week2.assignment2;

/**
 * Created by Laurens on 9-10-2017.
 */
public class Food {

    private double ratioConsumed = 0;

    public boolean hasLeft() {
        return ratioConsumed < 1;
    }

    public void eatABite() {
        if (!hasLeft()) {
            return;
        }
        System.out.println("Eating a bite");
        ratioConsumed += 0.1;
    }
}
