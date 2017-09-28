package nl.hanze.assignment1.observers

import nl.hanze.assignment1.StockUpdate
import nl.hanze.assignment1.View

/**
 * Created by Laurens on 25-9-2017.
 */
open class BaseObserver {

    private val views = mutableListOf<View>()

    fun addView(view: View) = views.add(view)

    fun removeView(view: View) = views.remove(view)

    fun updateViews(stockUpdate: StockUpdate) = views.forEach { it.update(stockUpdate) }
}
