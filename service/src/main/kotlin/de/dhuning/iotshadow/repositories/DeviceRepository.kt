package de.dhuning.iotshadow.repositories

import de.dhuning.iotshadow.api.Device
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface DeviceRepository : ReactiveMongoRepository<Device, UUID>
