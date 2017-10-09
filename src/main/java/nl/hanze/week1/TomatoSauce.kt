package nl.hanze.week1

// a Concrete Decorator
class TomatoSauce(newPizza: Pizza) : ToppingDecorator(newPizza) {

    init {
        println("Adding sauce")
    }

    override val description: String get() = tempPizza.description + ", tomato sauce"

    override val cost: Double get() {
        val cost = (.35 * size.multiplication).toEuro()
        println("Cost of sauce: $cost")
        return tempPizza.cost + cost
    }
}