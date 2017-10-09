package nl.hanze.week1.assignment3

import nl.hanze.week1.Pizza

interface PizzaStore {
    fun getPizza(name: String) : Pizza?
    operator fun get(name: String) = getPizza(name)
}