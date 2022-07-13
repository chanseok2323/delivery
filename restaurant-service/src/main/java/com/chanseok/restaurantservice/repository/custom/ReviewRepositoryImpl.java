package com.chanseok.restaurantservice.repository.custom;

import com.chanseok.restaurantservice.dto.ReviewsResponse;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.chanseok.restaurantservice.entity.QRestaurant.*;
import static com.chanseok.restaurantservice.entity.QReview.*;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public List<ReviewsResponse> findByNo(Long restaurantNo) {
        return jpaQueryFactory.select(Projections.bean(
                    ReviewsResponse.class, review.no, restaurant.name, review.comments, review.recommend, review.taps, review.pntrNo.coalesce(Long.valueOf("0")).as("pntrNo"), review.createAt)
                )
                .from(review)
                .innerJoin(review.restaurant, restaurant)
                .where(review.restaurant.no.eq(restaurantNo))
                .orderBy(review.no.asc(), review.pntrNo.coalesce(review.no).desc())
                .fetch();
    }

}
