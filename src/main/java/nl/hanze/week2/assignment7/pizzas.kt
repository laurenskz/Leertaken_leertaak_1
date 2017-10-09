package nl.hanze.week2.assignment7

data class Pizza(
        override val name: String,
        override val description: String,
        override val vegetarian: Boolean,
        override val price: Double
) : MenuItem

class PizzaHouse : MenuProvider {
    override val menu: Menu get() = object : Menu{
        var index = 0
        override fun hasNextItem() = index+1 in menuItems.indices
        override fun nextMenuItem() = menuItems[index++]
    }
    private val menuItems = mutableListOf(
            Pizza("tomato pizza", "a pizza with tomato's", true, 2.99),
            Pizza("salad pizza", "a pizza with salad", true, 2.99),
            Pizza("ham pizza", "a pizza with ham", false, 2.99),
            Pizza("bacon pizza", "a pizza with bacon", false, 2.99)
    )

    fun addPizza(name: String, description: String, vegetarian: Boolean, price: Double) {
        menuItems += Pizza(name, description, vegetarian, price)
    }
    fun getPizza(nr: Int) = menuItems[nr]
}

