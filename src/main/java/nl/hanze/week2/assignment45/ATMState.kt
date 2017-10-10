package nl.hanze.week2.assignment45

interface ATMState {

    fun insertCard(atm: ATM)

    fun ejectCard(atm: ATM)

    fun insertPin(atm: ATM)

    fun requestAmount(atm: ATM)

}

// implement the 5 concrete states

