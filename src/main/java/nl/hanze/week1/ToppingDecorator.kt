package nl.hanze.week1


// the Decorator
abstract class ToppingDecorator(protected val tempPizza: Pizza) : Pizza by tempPizza