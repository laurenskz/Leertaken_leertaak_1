package nl.hanze.week2.assignment1.devices

import nl.hanze.week2.assignment1.root.RemoteControll

object TelevisionRemoteControll : RemoteControll {
    override val device get() = Television()
}