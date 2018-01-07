package de.dhuning.iotshadow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IotShadowApplication

fun main(args: Array<String>) {
    runApplication<IotShadowApplication>(*args)
}
