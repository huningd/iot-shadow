package de.dhuning.iotshadow

import de.dhuning.iotshadow.repositories.DeviceRepository
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.web.reactive.function.server.RouterFunction

/**
 * Tests the devices api. Tests based on reactor testing:
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/testing.html#webtestclient
 */
@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class ApiTests {

    lateinit var client: WebTestClient

    @Autowired
    lateinit var deviceRepository: DeviceRepository

    @Autowired
    @Qualifier("deviceRouter")
    lateinit var route: RouterFunction<*>

    @Before
    fun setup() {
        client = WebTestClient.bindToRouterFunction(route).build()
    }

    @Test
    fun `API call for Devices`() {
        client.get().uri("/api/devices")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk

    }

}
