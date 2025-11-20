package org.escape.team_reason_be.repository.member

import com.querydsl.jpa.impl.JPAQueryFactory

class CustomMemberRepositoryImpl(
    val queryFactory: JPAQueryFactory
): CustomMemberRepository {

}