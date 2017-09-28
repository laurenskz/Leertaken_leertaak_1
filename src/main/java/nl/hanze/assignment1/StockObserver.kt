package nl.hanze.assignment1

import nl.hanze.assignment1.observers.Observer

/**
 * @param stockGrabber a reference to a concrete subject
 */
class StockObserver(private val stockGrabber: Subject) : Observer {

    private var ibmPrice: Double = 0.0
    private var aaplPrice: Double = 0.0
    private var googPrice: Double = 0.0

    // to track the observers
    private val observerID: Int

    init {
        this.observerID = ++observerIDTracker
        stockGrabber.register(this)

        println("New Observer $observerID")
    }

    // update all observers
    override fun update(stockUpdate: StockUpdate) {
        when(stockUpdate.stock){
            Stock.IBM-> this::ibmPrice
            Stock.GOOGLE -> this::googPrice
            Stock.AAPL -> this::aaplPrice
        }.set(stockUpdate.price)

        printThePrices()
    }

    fun printThePrices() {
        println("""$observerID
        | IBM: $ibmPrice
        | AAPL: $aaplPrice
        | GOOG: $googPrice""".trimMargin())
    }

    companion object {
        // static used as a counter
        private var observerIDTracker = 0
    }
}
