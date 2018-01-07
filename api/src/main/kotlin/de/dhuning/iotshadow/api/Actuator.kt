package de.dhuning.iotshadow.api

import java.time.OffsetDateTime

class Actuator(name: String, lastUpdate: OffsetDateTime, desired: State, actual: State, delta: State)
