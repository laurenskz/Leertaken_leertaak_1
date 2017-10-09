@file:JvmName("Runner")
package nl.hanze.week2.assignment7.newStrat

interface Formatter {
    operator fun invoke(text: String) : String
}

object UppercaseFormatter : Formatter {
    override fun invoke(text: String) = text.toUpperCase()
}

object LowercaseFormatter : Formatter {
    override fun invoke(text: String) = text.toLowerCase()
}

object ToggleCaseFormatter : Formatter {
    override fun invoke(text: String) = text.mapIndexed { index, char ->
            if (index%2 == 0) char.toLowerCase() else char.toUpperCase()
        }.joinToString("")
}

object NormalFormatter : Formatter {
    override fun invoke(text: String) = text
}
class Responder(var formatter: Formatter = NormalFormatter){
    fun respondTo(message: String) = println(formatter(message))
}



//is in Runner.class
fun main(args: Array<String>) {
    val responder = Responder()
    while (true){
        val line = readLine()!!
        if (line == "exit") break
        val split = line.lastIndexOf("--")
        val message = if (split == -1) line else {
            val way = line.slice(split+2 until line.length)
            responder.formatter = when(way.toLowerCase()) {
                "u" , "uppercase" -> UppercaseFormatter
                "l", "lowercase" -> LowercaseFormatter
                "t", "togglecase" -> ToggleCaseFormatter
                "n", "normal" -> NormalFormatter
                else -> responder.formatter
            }
            line.slice(0 until split)
        }
        responder.respondTo(message)
    }
}