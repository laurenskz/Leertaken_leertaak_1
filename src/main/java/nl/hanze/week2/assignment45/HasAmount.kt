package nl.hanze.week2.assignment45

/**
 * Created by Laurens on 9-10-2017.
 */
class HasAmount : ATMState {


    override fun insertCard(atm: ATM)  = println("Card already present")

    override fun ejectCard(atm: ATM) {
        println("Paid amount")
        atm.state = IdleState()
    }

    override fun insertPin(atm: ATM) =println("Pin already entered")

    override fun requestAmount(atm: ATM) = println("Amount already requested")
}
