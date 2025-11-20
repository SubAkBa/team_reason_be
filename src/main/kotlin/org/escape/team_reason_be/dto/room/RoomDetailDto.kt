package org.escape.team_reason_be.dto.room

import org.escape.team_reason_be.domain.room.Room
import org.escape.team_reason_be.domain.room.RoomType

data class RoomDetailDto(
    val name: String,
    val type: RoomType?,
    val level: Int,
    val description: String
) {
    companion object {
        fun from(room: Room): RoomDetailDto = RoomDetailDto(
            room.name ?: "",
            room.type,
            room.level ?: 0,
            room.description ?: ""
        )
    }
}