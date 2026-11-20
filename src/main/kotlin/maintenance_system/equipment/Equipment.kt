package maintenance_system.equipment

import jakarta.persistence.*
import java.time.LocalDate

enum class EquipmentStatus {
    IN_SERVICE,
    UNDER_MAINTENANCE,
    OUT_OF_SERVICE,
    DECOMMISSIONED
}

@Entity
@Table(name = "equipment")
class Equipment(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    var name: String,

    @Column(name = "inventory_number", nullable = false, unique = true)
    var inventoryNumber: String,

    var description: String? = null,

    var location: String? = null,

    var manufacturer: String? = null,

    var model: String? = null,

    var commissioningDate: LocalDate? = null,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var status: EquipmentStatus = EquipmentStatus.IN_SERVICE
)
