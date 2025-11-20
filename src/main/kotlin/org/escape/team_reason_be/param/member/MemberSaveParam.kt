package org.escape.team_reason_be.param.member

import org.escape.team_reason_be.domain.member.Member

data class MemberSaveParam(
    val email: String,
    val password: String,
    val name: String,
    val nickname: String
) {
    fun toEntity(): Member = Member(email, password, name, nickname)
}
