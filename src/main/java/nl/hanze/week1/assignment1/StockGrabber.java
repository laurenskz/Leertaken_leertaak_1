package nl.hanze.week1.assignment1;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    public void unregister(Observer newObserver) {
        observers.remove(newObserver);
    }

    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice) {

        this.ibmPrice = newIBMPrice;
        notifyObservers();

    }

    public void setAAPLPrice(double newAAPLPrice) {

        this.aaplPrice = newAAPLPrice;
        notifyObservers();
    }

    public void setGOOGPrice(double newGOOGPrice) {

        this.googPrice = newGOOGPrice;
        notifyObservers();
    }
}
