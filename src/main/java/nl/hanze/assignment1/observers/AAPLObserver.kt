package nl.hanze.assignment1.observers

import nl.hanze.assignment1.*

/**
 * Created by Laurens on 25-9-2017.
 */

class AAPLObserver(private val stockGrabber: Subject) : BaseObserver(), Observer {

    private var aaplPrice: Double = 0.0

    init {
        stockGrabber.register(this)
    }

    override fun update(stockUpdate: StockUpdate) {
        if (stockUpdate.stock==Stock.AAPL) {
            aaplPrice = stockUpdate.price
            updateViews(stockUpdate)
        }
    }
}
