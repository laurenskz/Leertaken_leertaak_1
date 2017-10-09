package nl.hanze.week2.assignment1.RemoteControl;

public class RemoteControl {

    // return a command receiver
    public static ElectronicDevice getDevice(){
        
        return new Television();
    }
}