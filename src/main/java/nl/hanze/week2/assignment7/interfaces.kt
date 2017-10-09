package nl.hanze.week2.assignment7


interface MenuItem {
    val name: String
    val description: String
    val vegetarian: Boolean
    val price: Double
}

interface Menu : Iterable<MenuItem> {
    override fun iterator() = object : AbstractIterator<MenuItem>() {
        override fun computeNext() = if (hasNextItem()) setNext(nextMenuItem()) else done()
    }
    fun hasNextItem(): Boolean
    fun nextMenuItem(): MenuItem

}
interface MenuProvider {
    val menu: Menu
}