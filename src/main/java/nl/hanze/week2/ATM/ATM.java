package nl.hanze.week2.ATM;

import nl.hanze.week2.ATM.proxy.AbstractAtm;

// the context
public class ATM implements AbstractAtm {
    private ATMState state;
    private int amount = 100;

    // define an initial state
    public ATM() {
        setState(new IdleState());
    }

    void setState(ATMState state) {
        this.state = state;
    }

    public ATMState getState() {
        return this.state;
    }

    @Override
    public int getCashInMachine() {
        return amount;
    }

    void insertCard() {
        state.insertCard(this);
    }

    void ejectCard() {
        state.ejectCard(this);
    }

    void insertPin() {
        state.insertPin(this);
    }

    void requestAmount() {
        state.requestAmount(this);
    }
}
