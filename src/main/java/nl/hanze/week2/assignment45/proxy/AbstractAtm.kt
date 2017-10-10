package nl.hanze.week2.assignment45.proxy

import nl.hanze.week2.assignment45.ATMState

/**
 * Created by Laurens on 9-10-2017.
 */
interface AbstractAtm {

    val state: ATMState?

    val cashInMachine: Int

}
