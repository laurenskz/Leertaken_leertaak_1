package nl.hanze.week1.assignment3



object PizzaStoreFactory{
    fun getPizzaStore(name: String) : PizzaStore = when(name.toLowerCase()){
        "fat" -> FatPizzaStore
        "skinny" -> SkinnyPizzaStore
        else -> EmptyPizzaStore()
    }
    operator fun get(name: String) = getPizzaStore(name)
}