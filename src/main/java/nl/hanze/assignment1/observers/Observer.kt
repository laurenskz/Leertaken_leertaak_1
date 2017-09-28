package nl.hanze.assignment1.observers

import nl.hanze.assignment1.StockUpdate

interface Observer {
    fun update(stockUpdate: StockUpdate)
}
