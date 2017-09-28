package nl.hanze.assignment3

import nl.hanze.assignment2.Pizza
import nl.hanze.assignment2.toppings.Mozzarella
import assignment2.toppings.TomatoSauce
import nl.hanze.assignment2.PlainPizza
import nl.hanze.assignment2.Size

object FatPizzaStore : PizzaStore {
    override fun getPizza(name: String): Pizza? = when (name.toLowerCase()) {
        "mozerella" -> Mozzarella(Mozzarella(Mozzarella(PlainPizza(Size.LARGE))))
        "tomato" -> TomatoSauce(TomatoSauce(TomatoSauce(PlainPizza(Size.LARGE))))
        else -> null
    }
}