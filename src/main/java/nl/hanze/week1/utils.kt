package nl.hanze.week1

import java.math.BigDecimal

fun Double.toEuro()  = toBigDecimal().setScale(2, BigDecimal.ROUND_HALF_UP).toDouble()