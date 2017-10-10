package nl.hanze.week2.assignment45

/**
 * Created by Laurens on 9-10-2017.
 */
class HasCard : ATMState {

    override fun insertCard(atm: ATM)= println("I already have a card")

    override fun ejectCard(atm: ATM) {
        println("Ejected card")
        atm.state = IdleState()
    }

    override fun insertPin(atm: ATM) {
        println("Succesfully entered pin")
        atm.state = HasCorrectPin()
    }
    override fun requestAmount(atm: ATM) = println("No pin entered")
}
