package de.dhuning.iotshadow.watchdog.configs

import net.javacrumbs.shedlock.core.LockProvider
import net.javacrumbs.shedlock.spring.ScheduledLockConfiguration
import net.javacrumbs.shedlock.spring.ScheduledLockConfigurationBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.Duration


@Configuration
class TaskScheduledConfig {

    @Bean
    fun taskScheduler(lockProvider: LockProvider): ScheduledLockConfiguration {
        return ScheduledLockConfigurationBuilder
                .withLockProvider(lockProvider)
                .withPoolSize(10)
                .withDefaultLockAtMostFor(Duration.ofMinutes(10))
                .build()
    }
}
