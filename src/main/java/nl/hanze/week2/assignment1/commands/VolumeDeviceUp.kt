package nl.hanze.week2.assignment1.commands

import nl.hanze.week2.assignment1.root.Command
import nl.hanze.week2.assignment1.root.ElectronicDevice

class VolumeDeviceUp(internal var myDevice: ElectronicDevice) : Command {
    override fun undo() = myDevice.volumeDown()
    operator override fun invoke() = myDevice.volumeUp()
}