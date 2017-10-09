package nl.hanze.week2.assignment1.devices

import nl.hanze.week2.assignment1.root.ElectronicDevice
import nl.hanze.week2.assignment1.root.RemoteControll

object RadioRemoteControl : RemoteControll {
    override val device: ElectronicDevice get() = Radio()
}