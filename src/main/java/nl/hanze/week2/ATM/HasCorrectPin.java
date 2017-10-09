package nl.hanze.week2.ATM;

/**
 * Created by Laurens on 9-10-2017.
 */
public class HasCorrectPin implements ATMState {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Already present");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("ejecting card");
        atm.setState(new IdleState());
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("Pin already entered");
    }

    @Override
    public void requestAmount(ATM atm) {
        System.out.println("SuccesFully requested amount");
        atm.setState(new HasAmount());
    }
}
