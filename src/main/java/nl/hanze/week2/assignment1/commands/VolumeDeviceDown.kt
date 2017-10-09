package nl.hanze.week2.assignment1.commands

import nl.hanze.week2.assignment1.root.Command
import nl.hanze.week2.assignment1.root.ElectronicDevice

class VolumeDeviceDown(internal var myDevice: ElectronicDevice) : Command {
    override fun undo() = myDevice.volumeUp()
    operator override fun invoke() = myDevice.volumeDown()
}