package nl.hanze.week1.assignment3

import nl.hanze.week1.Pizza

/**
 * nullobject for [PizzaStore]
 */
class EmptyPizzaStore : PizzaStore {
    override fun getPizza(name: String): Pizza? = null
}