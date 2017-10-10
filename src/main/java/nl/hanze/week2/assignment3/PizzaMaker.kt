package nl.hanze.week2.assignment3

/**
 * Created by Laurens on 9-10-2017.
 */
abstract class PizzaMaker {

    protected abstract val base: String

    protected abstract val toppings: Collection<String>

    fun createPizza(): Pizza {
        var base = base
        base = bake(base)
        val toppings = toppings
        val nonDeadlyToppings = toppings.filter { !isPoisonous(it) }
        return Pizza(base, nonDeadlyToppings)
    }

    private fun isPoisonous(topping: String) = "acid" in topping

    protected open fun bake(base: String) = "Baked $base in oven"
}

class PizzaKiller : PizzaMaker(){
    override val base = "loaf"
    override val toppings : Collection<String> = listOf("acid", "honey")
    override fun bake(base: String) = "baked $base in hell!"
}

class PizaLover : PizzaMaker(){
    override val base = "love"
    override val toppings : Collection<String> = listOf("pleasure", "enjoyment")
}