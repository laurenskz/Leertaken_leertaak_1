package nl.hanze.assignment2.toppings

import assignment2.toppings.ToppingDecorator
import nl.hanze.assignment2.Pizza
import nl.hanze.assignment2.toEuro

// a Concrete Decorator
class Mozzarella(newPizza: Pizza) : ToppingDecorator(newPizza) {

    init {
        println("Adding Mozzarella")
    }

    override val cost: Double get() {
        val cost = (.50 * size.multiplication).toEuro()
        println("Cost of mozzarella: $cost")
        return tempPizza.cost + cost
    }

    override val description: String get() = tempPizza.description + ", mozzarella"
}
