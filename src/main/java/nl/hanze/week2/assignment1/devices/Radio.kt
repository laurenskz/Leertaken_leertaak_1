package nl.hanze.week2.assignment1.devices
import nl.hanze.week2.assignment1.root.ElectronicDevice

// a comand receiver
class Radio : ElectronicDevice {

    private var volume = 0

    override fun on() = println("Radio is on")
    override fun off() = println("Radio is off")
    override fun volumeUp() = println("Radio Volume is at: ${++volume}")
    override fun volumeDown() = println("Radio Volume is at: ${volume--}")
}