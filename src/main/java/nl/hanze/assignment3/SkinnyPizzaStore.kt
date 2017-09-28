package nl.hanze.assignment3

import assignment2.toppings.*
import nl.hanze.assignment2.Pizza
import nl.hanze.assignment2.PlainPizza
import nl.hanze.assignment2.Size
import nl.hanze.assignment2.toppings.Mozzarella

object SkinnyPizzaStore : PizzaStore {
    override fun getPizza(name: String): Pizza? = when (name.toLowerCase()) {
        "mozerella" -> Mozzarella(PlainPizza(Size.SMALL))
        "tomato" -> TomatoSauce(PlainPizza(Size.SMALL))
        else -> null
    }
}