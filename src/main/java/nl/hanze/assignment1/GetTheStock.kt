package nl.hanze.assignment1

import java.util.Random


/**
 * Created by Laurens on 25-9-2017.
 */
class GetTheStock(
        private val stockGrabber: StockGrabber,
        private val stock: Stock
) : Runnable {
    private var price = stock.initialPrice

    override fun run() {
        while (!Thread.interrupted()){
            Thread.sleep(2000)
            price *= Random().nextGaussian() * STD_DEV + MEAN
            SETTERS[stock]?.invoke(stockGrabber, price)
        }
    }

    companion object {

        val STD_DEV = 0.05
        val MEAN = 1
        private val SETTERS = mutableMapOf<Stock, StockGrabber.(Double) -> Unit>().apply {
            put(Stock.IBM) { ibmPrice = it }
            put(Stock.AAPL) { aaplPrice = it }
            put(Stock.GOOGLE) { googPrice = it }
        }
    }
}
