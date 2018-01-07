package de.dhuning.iotshadow.watchdog

import net.javacrumbs.shedlock.core.SchedulerLock
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.Scheduled


@SpringBootApplication
class WatchDogApplication {
    companion object {
        const val FOURTEEN_MIN: Long = 14 * 60 * 1000
    }

    private val log = LoggerFactory.getLogger(WatchDogApplication::class.java)

    @Scheduled(fixedRate = 5000)
    @SchedulerLock(name = "doSomething", lockAtLeastFor = 4000, lockAtMostFor = FOURTEEN_MIN)
    fun doSomething() {
        log.debug("doSomething")
    }
}

fun main(args: Array<String>) {
    runApplication<WatchDogApplication>(*args)
}


