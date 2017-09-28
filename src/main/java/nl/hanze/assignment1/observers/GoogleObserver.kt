package nl.hanze.assignment1.observers

import nl.hanze.assignment1.*

/**
 * Created by Laurens on 25-9-2017.
 */
class GoogleObserver(private val stockGrabber: Subject) : BaseObserver(), Observer {

    private var googPrice: Double = 0.toDouble()

    init {
        stockGrabber.register(this)
    }

    override fun update(stockUpdate: StockUpdate) {
        if (stockUpdate.stock == Stock.GOOGLE){
            googPrice = stockUpdate.price
            updateViews(stockUpdate)
        }
    }
}
