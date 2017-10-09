package nl.hanze.week2.assignment1.devices

import nl.hanze.week2.assignment1.root.ElectronicDevice

// a comand receiver
class Television : ElectronicDevice {

    private var volume = 0

    override fun on() = println("TV is on")
    override fun off() = println("TV is off")
    override fun volumeUp() = println("TV Volume is at: ${++volume}")
    override fun volumeDown() = println("""TV Volume is at: ${volume--}""")
}