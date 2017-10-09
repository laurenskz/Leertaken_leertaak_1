package nl.hanze.week2.assignment1.commands

import nl.hanze.week2.assignment1.root.Command
import nl.hanze.week2.assignment1.root.ElectronicDevice

// a concrete command
class TurnDeviceOff(internal var myDevice: ElectronicDevice) : Command {
    override fun undo() = myDevice.on()
    override fun invoke()= myDevice.off()
}