package org.escape.team_reason_be.domain.member

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "member")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_no")
    val memberNo: Int? = null,

    @Column(name = "email")
    val email: String? = null,

    @Column(name = "password")
    val password: String? = null,

    @Column(name = "name")
    val name: String? = null,

    @Column(name = "nickname")
    val nickname: String? = null
) {
    private constructor(): this(null, null, null, null, null)
}