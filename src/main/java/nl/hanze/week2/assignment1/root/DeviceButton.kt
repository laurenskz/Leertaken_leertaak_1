package nl.hanze.week2.assignment1.root

import java.util.*

// invoker
class DeviceButton {

    val stack = Stack<Command>()
    operator fun invoke(cmd: Command){
        println("Device button is pressed!")
        stack.push(cmd)
        cmd()
    }

    fun undo(){
        println("Device button is pulled up!")
        stack.pop().undo()
    }
}