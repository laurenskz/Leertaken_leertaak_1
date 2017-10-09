package nl.hanze.week2.assignment1.RemoteControl;

// a concrete command
public class TurnTVOn implements Command {

    ElectronicDevice myDevice;
    
    public TurnTVOn(ElectronicDevice device){
        // register receiver
        myDevice = device;
    }
    
    public void execute() {

        myDevice.on();
    }
}