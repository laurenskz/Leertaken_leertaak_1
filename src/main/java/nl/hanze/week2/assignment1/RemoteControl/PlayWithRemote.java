package nl.hanze.week2.assignment1.RemoteControl;

// the client
public class PlayWithRemote{
    
    public static void main(String[] args){
        
        // create command receiver
        ElectronicDevice newDevice = RemoteControl.getDevice();
        
        // create a concrete command, register the receiver
        TurnTVOn onCommand = new TurnTVOn(newDevice);
        
        // create invoker
        DeviceButton b = new DeviceButton();
        
        // invoke command
        b.execute(onCommand);
        
        // create another concrete command        
        TurnTVOff offCommand = new TurnTVOff(newDevice);
        
        // invoke another concrete command
        b.execute(offCommand);
    }
}