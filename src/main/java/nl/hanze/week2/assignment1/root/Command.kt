package nl.hanze.week2.assignment1.root

// the command interface
interface Command {
    operator fun invoke()
    fun undo()
}