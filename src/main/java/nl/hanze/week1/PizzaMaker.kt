package nl.hanze.week1


// the CLient
object PizzaMaker {

    @JvmStatic
    fun main(args: Array<String>) {
        // create a basic pizza with mozzarella & tomatosauce

        TomatoSauce(Mozzarella(PlainPizza(Size.LARGE))).apply {
            println("Ingredients: $description")
            println("Size: $size")
            println("Price: $cost")
        }

    }

}