package nl.hanze.assignment1

infix fun Stock.updateTo(price: Double) = StockUpdate(this, price)
data class StockUpdate(val stock: Stock, val price: Double)