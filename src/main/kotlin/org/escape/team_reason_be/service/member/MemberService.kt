package org.escape.team_reason_be.service.member

import org.escape.team_reason_be.domain.member.Member
import org.escape.team_reason_be.dto.member.MemberDetailDto
import org.escape.team_reason_be.param.member.MemberSaveParam
import org.escape.team_reason_be.repository.member.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    @Transactional(readOnly = true)
    fun getMember(email: String): MemberDetailDto {
        val findMember: Member = memberRepository.findById(email).orElseThrow { IllegalArgumentException("멤버 정보를 찾을 수 없습니다.") }

        return MemberDetailDto.from(findMember)
    }

    @Transactional
    fun addMember(param: MemberSaveParam) {
        val member: Member = param.toEntity()

        memberRepository.save(member)
    }

    @Transactional
    fun modifyMember(param: MemberSaveParam) {
        val member: Member = param.toEntity()

        memberRepository.save(member)
    }

    @Transactional
    fun removeMember(email: String) {
        memberRepository.deleteById(email)
    }
}