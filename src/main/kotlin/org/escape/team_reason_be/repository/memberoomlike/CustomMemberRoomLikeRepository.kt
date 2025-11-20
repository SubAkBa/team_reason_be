package org.escape.team_reason_be.repository.memberoomlike

import org.springframework.stereotype.Repository

@Repository
interface CustomMemberRoomLikeRepository {

    fun insertLike(roomNo: Int, memberNo: Int)
}