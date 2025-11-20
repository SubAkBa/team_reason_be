package org.escape.team_reason_be.repository.memberoomlike

import org.escape.team_reason_be.domain.memberroomlike.MemberRoomId
import org.escape.team_reason_be.domain.memberroomlike.MemberRoomLike
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRoomLikeRepository: JpaRepository<MemberRoomLike, MemberRoomId>, CustomMemberRoomLikeRepository {
}