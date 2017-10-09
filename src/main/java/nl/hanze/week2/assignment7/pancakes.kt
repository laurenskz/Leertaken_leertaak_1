package nl.hanze.week2.assignment7


data class Pancake(
        override val name: String,
        override val description: String,
        override val vegetarian: Boolean,
        override val price: Double
) : MenuItem


class PancakeHouse : MenuProvider {
    override val menu : Menu get() =object : Menu {
        var index = 0
        override fun hasNextItem() = index in 0 until numberOfItems
        override fun nextMenuItem() = menuItems[index++]!!
    }

    private var numberOfItems: Int = 0
    private val menuItems = arrayOfNulls<Pancake>(MAX_ITEMS).apply {
        this[numberOfItems++] = Pancake("sugar pancake", "a plain pancake with sugar", true, 1.99)
        this[numberOfItems++] = Pancake("syrop pancake", "a pancake with syrop", true, 1.99)
        this[numberOfItems++] = Pancake("ham sugar pancake", "a pancake with ham and sugar", false, 2.50)
        this[numberOfItems++] = Pancake("ham syrop pancake", "a pancake with ham and syrop", false, 2.50)
    }

    operator fun get(nr: Int) = menuItems[nr]
    fun addPancake(name: String, description: String, vegetarian: Boolean, price: Double) = when (numberOfItems) {
        in 0 until MAX_ITEMS -> {
            menuItems[numberOfItems++] = Pancake(name, description, vegetarian, price)
            true
        }
        else -> false
    }

    companion object {
        val MAX_ITEMS = 6
    }

}

