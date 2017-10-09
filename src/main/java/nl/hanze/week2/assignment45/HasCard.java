package nl.hanze.week2.assignment45;

/**
 * Created by Laurens on 9-10-2017.
 */
public class HasCard implements ATMState {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("I already have a card");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Ejected card");
        atm.setState(new IdleState());
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("Succesfully entered pin");
        atm.setState(new HasCorrectPin());
    }

    @Override
    public void requestAmount(ATM atm) {
        System.out.println("No pin entered");
    }
}
