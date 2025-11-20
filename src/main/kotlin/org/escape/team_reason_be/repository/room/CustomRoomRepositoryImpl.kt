package org.escape.team_reason_be.repository.room

import com.querydsl.jpa.impl.JPAQueryFactory
import org.escape.team_reason_be.domain.room.QRoom.*
import org.escape.team_reason_be.param.room.RoomSaveParam
import org.springframework.stereotype.Repository

@Repository
class CustomRoomRepositoryImpl(
    private val queryFactory: JPAQueryFactory
): CustomRoomRepository {

    override fun updateRoom(roomNo: Int, param: RoomSaveParam) {
        queryFactory.update(room)
            .set(room.name, param.name)
            .set(room.type, param.type)
            .set(room.level, param.level)
            .set(room.description, param.description)
            .where(room.roomNo.eq(roomNo))
            .execute()
    }
}