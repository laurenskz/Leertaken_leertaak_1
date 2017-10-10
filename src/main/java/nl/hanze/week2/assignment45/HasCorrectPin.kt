package nl.hanze.week2.assignment45

/**
 * Created by Laurens on 9-10-2017.
 */
class HasCorrectPin : ATMState {

    override fun insertCard(atm: ATM) = println("Already present")

    override fun ejectCard(atm: ATM) {
        println("ejecting card")
        atm.state = IdleState()
    }

    override fun insertPin(atm: ATM) = println("Pin already entered")

    override fun requestAmount(atm: ATM) {
        println("SuccesFully requested amount")
        atm.state =HasAmount()
    }
}
