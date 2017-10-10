package nl.hanze.week2.assignment45

import nl.hanze.week2.assignment45.proxy.AbstractAtm

// the context
class ATM : AbstractAtm {
    // define an initial state
    override var state: ATMState = IdleState()
        internal set
    override val cashInMachine = 100

    internal fun insertCard() {
        state.insertCard(this)
    }

    internal fun ejectCard() {
        state.ejectCard(this)
    }

    internal fun insertPin() {
        state.insertPin(this)
    }

    internal fun requestAmount() {
        state.requestAmount(this)
    }
}
