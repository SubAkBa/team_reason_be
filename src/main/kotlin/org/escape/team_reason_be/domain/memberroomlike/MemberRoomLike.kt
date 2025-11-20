package org.escape.team_reason_be.domain.memberroomlike

import jakarta.persistence.Column
import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.MapsId
import jakarta.persistence.Table
import org.escape.team_reason_be.domain.member.Member
import org.escape.team_reason_be.domain.room.Room
import java.time.LocalDateTime

@Entity
@Table(name = "member_room_like")
class MemberRoomLike(
    @EmbeddedId
    val memberRoomId: MemberRoomId,

    @Column(name = "liked_at")
    val likedAt: LocalDateTime,

    @MapsId("roomNo")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_no")
    val room: Room,

    @MapsId("memberNo")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_no")
    val member: Member
) {
    private constructor(): this(memberRoomId = MemberRoomId(), LocalDateTime.now(), Room(), Member())
}