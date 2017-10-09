package nl.hanze.week2.assignment45

import java.util.*

fun main(vararg args: String) {
    // create the context
    val atm = ATM()
    atm.state = IdleState()

    println("Type a number for an event:")
    println("1. Insert card")
    println("2. Enter PIN code")
    println("3. Enter amount")
    println("4. I want my money honey")
    println()

    println("Insert your card")

    val scanner = Scanner(System.`in`)
    for (line in scanner) {
        if (line == "exit") break
        when (line.toIntOrNull()) {
            null -> println("This is not a number")
            1 -> atm.insertCard()
            2 -> atm.insertPin()
            3 -> atm.requestAmount()
            4 -> atm.ejectCard()
        }
    }
}