package nl.hanze.week2.assignment2;

/**
 * Created by Laurens on 9-10-2017.
 */
public class Thread {

    private Runnable target;

    public Thread(Runnable target) {
        this.target = target;
    }

    public void start() {
        target.run();
    }
}
