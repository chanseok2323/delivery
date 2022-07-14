package com.chanseok.store.repository.custom;

import com.chanseok.store.dto.MenuDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.chanseok.store.entity.QMenu.*;
import static com.chanseok.store.entity.QStore.store;

@Repository
@RequiredArgsConstructor
public class StoreRepositoryImpl implements StoreRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public List<MenuDto> findByStoreNo(Long no) {
        return jpaQueryFactory.select(Projections.bean(MenuDto.class, menu.no, menu.name, menu.price, menu.comments))
                .from(menu)
                .innerJoin(menu.store, store)
                .where(menu.store.no.eq(no))
                .fetch();
    }

}
