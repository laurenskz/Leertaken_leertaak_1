package nl.hanze.week2.ATM;

/**
 * Created by Laurens on 9-10-2017.
 */
public class HasAmount implements ATMState {


    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card already present");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Paid amount");
        atm.setState(new IdleState());
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("Pin already entered");
    }

    @Override
    public void requestAmount(ATM atm) {
        System.out.println("Amount already requested");
    }
}
