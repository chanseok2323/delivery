package com.chanseok.restaurantservice.repository;

import com.chanseok.restaurantservice.dto.MenuDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.chanseok.restaurantservice.entity.QMenu.*;
import static com.chanseok.restaurantservice.entity.QRestaurant.*;

@Repository
@RequiredArgsConstructor
public class CustomRestaurantRepositoryImpl implements CustomRestaurantRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public List<MenuDto> findByRestaurantNo(Long no) {
        return jpaQueryFactory.select(Projections.bean(MenuDto.class, menu.no, menu.name, menu.price, menu.comments))
                .from(menu)
                .innerJoin(menu.restaurant, restaurant)
                .where(menu.restaurant.no.eq(no))
                .fetch();
    }
}
