package org.escape.team_reason_be.param.room

import org.escape.team_reason_be.domain.room.Room
import org.escape.team_reason_be.domain.room.RoomType

data class RoomSaveParam(
    val name: String,
    val type: RoomType,
    val level: Int,
    val description: String
) {
    fun toEntity(): Room = Room(null, name, type, level, description)
}