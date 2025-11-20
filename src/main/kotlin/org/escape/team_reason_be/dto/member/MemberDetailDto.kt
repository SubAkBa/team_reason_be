package org.escape.team_reason_be.dto.member

import org.escape.team_reason_be.domain.member.Member

data class MemberDetailDto(
    val email: String,
    val name: String,
    val nickname: String
) {
    companion object {
        fun from(member: Member): MemberDetailDto = MemberDetailDto(member.email ?: "", member.name ?: "", member.nickname ?: "")
    }
}
