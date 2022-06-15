package com.chanseok.userservice.repository;

import com.chanseok.userservice.dto.ResponseMember;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.chanseok.userservice.entity.QMember.*;

@Repository
@RequiredArgsConstructor
public class CustomMemberRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public Optional<ResponseMember> findByMember(String email, String password) {
        return Optional.ofNullable(
                jpaQueryFactory.select(Projections.bean(ResponseMember.class, member.email, member.password, member.nickname, member.phone))
                        .from(member)
                        .where(member.email.eq(email).and(member.password.eq(password)))
                        .fetchOne()
        );
    }
}
