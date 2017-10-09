package nl.hanze.week2.ATM.proxy;

import nl.hanze.week2.ATM.ATM;
import nl.hanze.week2.ATM.ATMState;

/**
 * Created by Laurens on 9-10-2017.
 */
public class ATMProxy implements AbstractAtm {

    private AbstractAtm realATM = new ATM();
    private User user;

    public ATMProxy(User user) {
        this.user = user;
    }

    @Override
    public ATMState getState() {
        if (user.getAge() < 10) {
            return null;
        }
        return realATM.getState();
    }

    @Override
    public int getCashInMachine() {
        if (user.getAge() < 10) {
            return -1;
        }
        return realATM.getCashInMachine();
    }
}
