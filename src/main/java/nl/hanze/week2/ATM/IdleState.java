package nl.hanze.week2.ATM;

/**
 * Created by Laurens on 9-10-2017.
 */
public class IdleState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Succesfully inserted card");
        atm.setState(new HasCard());
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("No card present");
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("No card present");
    }

    @Override
    public void requestAmount(ATM atm) {
        System.out.println("No card present");
    }
}
