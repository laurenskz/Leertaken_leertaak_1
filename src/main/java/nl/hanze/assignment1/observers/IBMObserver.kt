package nl.hanze.assignment1.observers

import nl.hanze.assignment1.*

/**
 * Created by Laurens on 25-9-2017.
 */
class IBMObserver(private val stockGrabber: Subject) : BaseObserver(), Observer {

    private var ibmPrice: Double = 0.0

    init {
        stockGrabber.register(this)
    }

    override fun update(stockUpdate: StockUpdate) {
        if (stockUpdate.stock == Stock.IBM) {
            this.ibmPrice = stockUpdate.price
            updateViews(stockUpdate)
        }
    }
}
