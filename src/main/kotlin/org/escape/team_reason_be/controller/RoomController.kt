package org.escape.team_reason_be.controller

import org.escape.team_reason_be.dto.room.RoomDetailDto
import org.escape.team_reason_be.dto.room.RoomDto
import org.escape.team_reason_be.param.room.RoomSaveParam
import org.escape.team_reason_be.service.room.RoomService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/room")
class RoomController(
    private val roomService: RoomService
) {
    @GetMapping
    fun getAllRoomList(): List<RoomDto> {
        return roomService.getAllRoomList()
    }

    @GetMapping("/{roomNo}")
    fun getRoomDetail(@PathVariable roomNo: Int): RoomDetailDto {
        return roomService.getRoomDetail(roomNo)
    }

    @PostMapping
    fun addRoom(@RequestBody param: RoomSaveParam) {
        roomService.addRoom(param)
    }

    @PutMapping("/{roomNo}")
    fun modifyRoom(@PathVariable roomNo: Int, @RequestBody param: RoomSaveParam) {
        roomService.modifyRoom(roomNo, param)
    }

    @DeleteMapping("/{roomNo}")
    fun removeRoom(@PathVariable roomNo: Int) {
        roomService.removeRoom(roomNo)
    }
}