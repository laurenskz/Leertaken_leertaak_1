package nl.hanze.assignment1

import nl.hanze.assignment1.observers.Observer


interface Subject {
    fun register(observer: Observer)
    fun unregister(observer: Observer)
    fun notifyObservers(stockUpdate: StockUpdate)
}
