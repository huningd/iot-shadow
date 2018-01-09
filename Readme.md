# Iot Shadow Example
Example project using spring boot 2 to release a reactive iot device shadow. Additional it contains a watchdog which can be used to poll device updates. This watchdog can be used for devices which are unable to push changes.
## Service
## Watchdog
The watchdog uses spring scheduled tasks for polling. Running scheduled tasks with multiple instances can cause problems. Each instance will execute the scheduled tasks. This project uses a library to lock tasks so that each task will be execute just in one instance.

## Helpful links
* https://docs.spring.io/spring/docs/5.0.0.BUILD-SNAPSHOT/spring-framework-reference/html/web-reactive.html
* DZone artical of ShedLock developer: https://dzone.com/articles/implementing-scheduler-lock
* ShedLock repo: https://github.com/lukas-krecan/ShedLock
* Petclinic with WebFlux: https://ssouris.github.io/2017/06/02/petclinic-spring-5-kotlin-reactive-mongodb.html

