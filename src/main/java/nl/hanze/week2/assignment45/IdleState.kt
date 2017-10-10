package nl.hanze.week2.assignment45

/**
 * Created by Laurens on 9-10-2017.
 */
class IdleState : ATMState {
    override fun insertCard(atm: ATM) {
        println("Succesfully inserted card")
        atm.state= HasCard()
    }

    override fun ejectCard(atm: ATM) = println("No card present")

    override fun insertPin(atm: ATM) = println("No card present")

    override fun requestAmount(atm: ATM) = println("No card present")
}
