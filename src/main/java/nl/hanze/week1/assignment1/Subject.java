package nl.hanze.week1.assignment1;


public interface Subject {
    
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObservers();

}
