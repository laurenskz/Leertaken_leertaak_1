package nl.hanze.assignment1

import javafx.scene.Node

/**
 * Created by Laurens on 25-9-2017.
 */
interface View {

    val node: Node

    fun update(stockUpdate: StockUpdate)
}

