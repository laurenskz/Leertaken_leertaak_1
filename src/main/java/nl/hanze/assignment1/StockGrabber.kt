package nl.hanze.assignment1

import nl.hanze.assignment1.observers.Observer
import kotlin.properties.Delegates.observable

class StockGrabber : Subject {
    private val observers = mutableListOf<Observer>()

    var ibmPrice by observable(0.0){_,_,new -> notifyObservers(Stock.IBM updateTo new) }
    var aaplPrice by observable(0.0){_,_,new -> notifyObservers(Stock.AAPL updateTo new) }
    var googPrice by observable(0.0){ _, _, new -> notifyObservers(Stock.GOOGLE updateTo new) }

    override fun register(observer: Observer) {
        observers+= observer
    }

    override fun unregister(observer: Observer) {
        observers+= observer
    }

    override fun notifyObservers(stockUpdate: StockUpdate)
            = observers.forEach { it.update(stockUpdate) }
}
