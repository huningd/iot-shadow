package de.dhuning.iotshadow.api

import java.util.*

interface DeviceApi {

    fun updateDevice(deviceId: UUID)

    fun fetchDevice(deviceId: UUID): Device
}

