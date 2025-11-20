package org.escape.team_reason_be.domain.memberroomlike

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
data class MemberRoomId(
    val memberNo: Int = 0,
    val roomNo: Int = 0
): Serializable