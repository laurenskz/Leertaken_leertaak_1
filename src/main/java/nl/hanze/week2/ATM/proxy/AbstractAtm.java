package nl.hanze.week2.ATM.proxy;

import nl.hanze.week2.ATM.ATMState;

/**
 * Created by Laurens on 9-10-2017.
 */
public interface AbstractAtm {

    ATMState getState();

    int getCashInMachine();

}
