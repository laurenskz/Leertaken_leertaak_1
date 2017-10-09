package nl.hanze.week2.assignment1.commands

import nl.hanze.week2.assignment1.root.Command
import nl.hanze.week2.assignment1.root.ElectronicDevice

// a concrete command
class TurnDeviceOn(internal var myDevice: ElectronicDevice) : Command {
    override fun undo() = myDevice.on()

    operator override fun invoke() = myDevice.on()
}