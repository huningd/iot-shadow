# Iot Shadow Example
Example project using spring boot 2 to release a reactive iot device shadow. Addtional it contains a watchdog which can be used to poll device updates.
## Service
## Watchdog
The watchdog uses spring scheduled tasks for polling. Running scheduled tasks with multiple instances can cause problems. Each instance will execute the scheduled tasks. This project uses a library to lock tasks so that each task will be execute just in one instance.

## Helpful links

