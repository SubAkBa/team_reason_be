package org.escape.team_reason_be.repository.room

import org.escape.team_reason_be.domain.room.Room
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoomRepository: JpaRepository<Room, Int>, CustomRoomRepository