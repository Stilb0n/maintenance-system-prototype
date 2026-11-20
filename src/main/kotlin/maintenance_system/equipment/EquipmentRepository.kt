package maintenance_system.equipment

import org.springframework.data.jpa.repository.JpaRepository

interface EquipmentRepository : JpaRepository<Equipment, Long>

