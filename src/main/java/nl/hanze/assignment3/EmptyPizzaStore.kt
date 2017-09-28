package nl.hanze.assignment3

import nl.hanze.assignment2.Pizza

/**
 * nullobject for [PizzaStore]
 */
class EmptyPizzaStore : PizzaStore {
    override fun getPizza(name: String): Pizza? = null
}