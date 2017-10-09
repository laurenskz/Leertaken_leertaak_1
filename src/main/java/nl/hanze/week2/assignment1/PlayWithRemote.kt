package nl.hanze.week2.assignment1

import nl.hanze.week2.assignment1.commands.TurnDeviceOff
import nl.hanze.week2.assignment1.commands.TurnDeviceOn
import nl.hanze.week2.assignment1.devices.RadioRemoteControl
import nl.hanze.week2.assignment1.devices.TelevisionRemoteControll
import nl.hanze.week2.assignment1.root.DeviceButton
import nl.hanze.week2.assignment1.root.ElectronicDevice

// the client
fun main(args: Array<String>) {
    // create command receiver
    executeCommands(TelevisionRemoteControll.device)
    executeCommands(RadioRemoteControl.device)
}

fun executeCommands(device: ElectronicDevice){

    // create a concrete command, register the receiver
    val onCommand = TurnDeviceOn(device)

    // create invoker
    val button = DeviceButton()

    // invoke command
    button(onCommand)

    // create another concrete command
    val offCommand = TurnDeviceOff(device)

    // invoke another concrete command
    button(offCommand)

    // create another concrete command
    val volumeUpCommand = TurnDeviceOff(device)

    // invoke another concrete command
    button(volumeUpCommand)

    // create another concrete command
    val volumeDownCommand = TurnDeviceOff(device)

    // invoke another concrete command
    button(volumeDownCommand)

    button.undo()
}