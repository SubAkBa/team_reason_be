package org.escape.team_reason_be.controller.member

import org.escape.team_reason_be.dto.member.MemberDetailDto
import org.escape.team_reason_be.param.member.MemberSaveParam
import org.escape.team_reason_be.service.member.MemberService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class MemberController(
    private val memberService: MemberService
) {
    @GetMapping
    fun getMember(@RequestParam email: String): MemberDetailDto {
        return memberService.getMember(email)
    }

    @PostMapping
    fun addMember(@RequestBody param: MemberSaveParam) {
        memberService.addMember(param)
    }

    @PutMapping
    fun modifyMember(@RequestBody param: MemberSaveParam) {
        memberService.modifyMember(param)
    }

    @DeleteMapping
    fun removeMember(@RequestParam email: String) {
        memberService.removeMember(email)
    }
}