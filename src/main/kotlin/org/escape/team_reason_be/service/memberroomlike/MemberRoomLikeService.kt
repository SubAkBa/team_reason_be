package org.escape.team_reason_be.service.memberroomlike

import org.escape.team_reason_be.repository.memberoomlike.MemberRoomLikeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberRoomLikeService(
    private val memberRoomLikeRepository: MemberRoomLikeRepository
) {
    @Transactional
    fun pressLike(roomNo: Int, memberNo: Int) {
        memberRoomLikeRepository.insertLike(roomNo, memberNo)
    }
}