package org.escape.team_reason_be.repository.memberoomlike

import com.querydsl.jpa.impl.JPAQueryFactory
import org.escape.team_reason_be.domain.memberroomlike.QMemberRoomLike.*
import java.time.LocalDateTime

class CustomMemberRoomLikeRepositoryImpl(
    private val queryFactory: JPAQueryFactory
): CustomMemberRoomLikeRepository {

    override fun insertLike(roomNo: Int, memberNo: Int) {
        queryFactory.insert(memberRoomLike)
            .set(memberRoomLike.memberRoomId.roomNo, roomNo)
            .set(memberRoomLike.memberRoomId.memberNo, memberNo)
            .set(memberRoomLike.likedAt, LocalDateTime.now())
            .execute()
    }
}