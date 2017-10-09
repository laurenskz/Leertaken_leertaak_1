package nl.hanze.week1.assignment3

import nl.hanze.week1.Pizza
import nl.hanze.week1.Mozzarella
import nl.hanze.week1.TomatoSauce
import nl.hanze.week1.PlainPizza
import nl.hanze.week1.Size

object FatPizzaStore : PizzaStore {
    override fun getPizza(name: String): Pizza? = when (name.toLowerCase()) {
        "mozerella" -> Mozzarella(Mozzarella(Mozzarella(PlainPizza(Size.LARGE))))
        "tomato" -> TomatoSauce(TomatoSauce(TomatoSauce(PlainPizza(Size.LARGE))))
        else -> null
    }
}