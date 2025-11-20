package org.escape.team_reason_be.repository.member

import org.escape.team_reason_be.domain.member.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository: JpaRepository<Member, String>, CustomMemberRepository {
}