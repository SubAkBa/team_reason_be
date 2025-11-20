package org.escape.team_reason_be.dto.room

import org.escape.team_reason_be.domain.room.Room

data class RoomDto(
    val roomNo: Int,
    val name: String?
) {
    companion object {
        fun from(room: Room): RoomDto = RoomDto(roomNo = room.roomNo ?: 0, room.name ?: "")
    }
}