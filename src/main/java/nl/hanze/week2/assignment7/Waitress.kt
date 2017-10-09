package nl.hanze.week2.assignment7


fun List<MenuItem>.toOrder() = Order(this)
data class Order(val price: Double, val items: List<MenuItem>) {
    constructor(items: List<MenuItem>) : this(items.sumByDouble { it.price }, items)
}

class ChoiceDSL(private var current: Sequence<MenuItem>) {
    inline fun <reified T : MenuItem> requestKind() = requestKind(T::class.java)
    fun <T : MenuItem> requestKind(type: Class<T>) {
        current = current.filterIsInstance(type)
    }

    var vega: Boolean
        @Deprecated("", level = DeprecationLevel.HIDDEN) get() = throw TODO("not supported")
        set(value) {
            current = current.filter { it.vegetarian == value }
        }

    fun getOrder() = current.toList().toOrder()
}

class Waitress(vararg var menuProviders: MenuProvider) {
    private fun getAll() = menuProviders.flatMap { it.menu }
    fun order(choice: ChoiceDSL.() -> Unit): Order {
        val all = getAll().toList()
        return ChoiceDSL(getAll().asSequence()).also(choice).getOrder()
    }
}

fun main(args: Array<String>) {
    val pancakeHouse = PancakeHouse()
    val waitress = Waitress(pancakeHouse, PizzaHouse())
    waitress.orderVegaPancake()
    pancakeHouse.addPancake("NEW", "A NEW PANCAKE", true, 999.99)
    println("pizza added")
    waitress.orderVegaPancake()
}

fun Waitress.orderVegaPancake() {
    val (price, items) = order {
        requestKind<Pancake>()
        vega = true
    }
    println("ordered ${items.joinToString("\n")} for price: $price")
}