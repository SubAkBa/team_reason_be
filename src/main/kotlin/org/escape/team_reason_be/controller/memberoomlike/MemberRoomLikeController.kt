package org.escape.team_reason_be.controller.memberoomlike

import org.escape.team_reason_be.service.memberroomlike.MemberRoomLikeService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/like")
class MemberRoomLikeController(
    private val memberRoomLikeService: MemberRoomLikeService
) {
    @PostMapping
    fun pressLike(@RequestParam roomNo: Int, @RequestParam memberNo: Int) {
        memberRoomLikeService.pressLike(roomNo, memberNo)
    }
}