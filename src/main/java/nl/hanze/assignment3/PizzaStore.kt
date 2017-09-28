package nl.hanze.assignment3

import nl.hanze.assignment2.Pizza

interface PizzaStore {
    fun getPizza(name: String) : Pizza?
    operator fun get(name: String) = getPizza(name)
}