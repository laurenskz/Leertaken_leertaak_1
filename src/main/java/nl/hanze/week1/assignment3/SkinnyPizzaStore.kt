package nl.hanze.week1.assignment3

import nl.hanze.week1.Pizza
import nl.hanze.week1.PlainPizza
import nl.hanze.week1.Size
import nl.hanze.week1.Mozzarella
import nl.hanze.week1.TomatoSauce

object SkinnyPizzaStore : PizzaStore {
    override fun getPizza(name: String): Pizza? = when (name.toLowerCase()) {
        "mozerella" -> Mozzarella(PlainPizza(Size.SMALL))
        "tomato" -> TomatoSauce(PlainPizza(Size.SMALL))
        else -> null
    }
}