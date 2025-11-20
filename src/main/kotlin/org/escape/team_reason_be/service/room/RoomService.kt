package org.escape.team_reason_be.service.room

import org.escape.team_reason_be.domain.room.Room
import org.escape.team_reason_be.dto.room.RoomDetailDto
import org.escape.team_reason_be.dto.room.RoomDto
import org.escape.team_reason_be.param.room.RoomSaveParam
import org.escape.team_reason_be.repository.room.RoomRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class RoomService(
    private val roomRepository: RoomRepository
) {
    @Transactional(readOnly = true)
    fun getAllRoomList(): List<RoomDto> {
        val roomList: List<Room> = roomRepository.findAll()

        return roomList.map { RoomDto.from(it) }
    }

    @Transactional(readOnly = true)
    fun getRoomDetail(roomNo: Int): RoomDetailDto {
        val findRoom: Room = roomRepository.findById(roomNo).orElseThrow { IllegalArgumentException("방 정보를 찾을 수 없습니다.") }

        return RoomDetailDto.from(findRoom)
    }

    @Transactional
    fun addRoom(param: RoomSaveParam) {
        roomRepository.save(param.toEntity())
    }

    @Transactional
    fun modifyRoom(roomNo: Int, param: RoomSaveParam) {
        roomRepository.updateRoom(roomNo, param)
    }

    @Transactional
    fun removeRoom(roomNo: Int) {
        roomRepository.deleteById(roomNo)
    }
}