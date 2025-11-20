package org.escape.team_reason_be.controller.room

import org.escape.team_reason_be.dto.room.RoomDetailDto
import org.escape.team_reason_be.dto.room.RoomDto
import org.escape.team_reason_be.param.room.RoomSaveParam
import org.escape.team_reason_be.service.room.RoomService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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