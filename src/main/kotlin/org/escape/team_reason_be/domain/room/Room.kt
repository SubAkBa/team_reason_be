package org.escape.team_reason_be.domain.room

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "room")
class Room(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_no")
    var roomNo: Int? = null,

    @Column(name = "name")
    var name: String? = null,

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    var type: RoomType? = null,

    @Column(name = "level")
    var level: Int? = null,

    @Column(name = "description")
    var description: String? = null
) {
    private constructor(): this(null, null, null, null, null)
}