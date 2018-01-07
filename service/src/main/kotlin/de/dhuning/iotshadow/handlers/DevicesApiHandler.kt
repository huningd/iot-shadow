package de.dhuning.iotshadow.handlers

import de.dhuning.iotshadow.api.Device
import de.dhuning.iotshadow.repositories.DeviceRepository
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import java.util.*

@Component
class DevicesApiHandler(val deviceRepository: DeviceRepository) {
    //https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#webflux-fn-handler-functions
    fun getDevices(serverRequest: ServerRequest) = ok().body(deviceRepository.findAll(), Device::class.java)

    fun getDevice(serverRequest: ServerRequest) = ok().body(deviceRepository.findById(UUID.fromString(serverRequest.pathVariable("id"))), Device::class.java)
}
