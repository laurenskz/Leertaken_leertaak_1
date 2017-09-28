package nl.hanze.assignment2


// a Concrete Component
class PlainPizza(override val size: Size = Size.MEDIUM) : Pizza {
    override val description: String = "a $size plain pizza"

    override val cost: Double get() {
        val cost = (4.0 * size.multiplication).toEuro()
        println("Cost of plain pizza: $cost")
        return cost
    }
}
