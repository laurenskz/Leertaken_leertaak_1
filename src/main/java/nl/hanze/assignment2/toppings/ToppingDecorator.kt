package assignment2.toppings

import nl.hanze.assignment2.Pizza

// the Decorator
abstract class ToppingDecorator(protected val tempPizza: Pizza) : Pizza by tempPizza