package nl.hanze.week2.assignment45.proxy

import nl.hanze.week2.assignment45.ATM
import nl.hanze.week2.assignment45.ATMState

/**
 * Created by Laurens on 9-10-2017.
 */
class ATMProxy(private val user: User) : AbstractAtm {

    private val realATM = ATM()

    override val state: ATMState?
        get() = if (user.age < 10) null else realATM.state

    override val cashInMachine: Int
        get() = if (user.age < 10)  -1 else realATM.cashInMachine
}
