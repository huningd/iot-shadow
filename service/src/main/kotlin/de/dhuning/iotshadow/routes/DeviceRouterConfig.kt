package de.dhuning.iotshadow.routes

import de.dhuning.iotshadow.handlers.DevicesApiHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RouterFunctions.resources
import org.springframework.web.reactive.function.server.router

@Configuration
class DeviceRouterConfig {
    //https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#webflux-fn
    @Bean
    @DependsOn("deviceRouter")
    fun resourceRouter() = resources("/**", ClassPathResource("static/"))

    @Bean
    fun deviceRouter(devicesApiHandler: DevicesApiHandler) =
            router {
                (accept(MediaType.APPLICATION_JSON) and "/api").nest {
                    "/devices".nest {
                        GET("/", devicesApiHandler::getDevices)
                        GET("/{id}", devicesApiHandler::getDevice)
                    }
                }
            }
}
