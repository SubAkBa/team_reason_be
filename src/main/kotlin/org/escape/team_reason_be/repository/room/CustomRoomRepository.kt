package org.escape.team_reason_be.repository.room

import org.escape.team_reason_be.param.room.RoomSaveParam
import org.springframework.stereotype.Repository

@Repository
interface CustomRoomRepository {
    fun updateRoom(roomNo: Int, param: RoomSaveParam)
}