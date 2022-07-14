package com.chanseok.store.repository.custom;

import com.chanseok.store.dto.ReviewsResponse;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.chanseok.store.entity.QReview.*;
import static com.chanseok.store.entity.QStore.*;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public List<ReviewsResponse> findByNo(Long restaurantNo) {
        return jpaQueryFactory.select(Projections.bean(
                    ReviewsResponse.class, review.no, review.store.name, review.comments, review.recommend, review.taps, review.pntrNo.coalesce(Long.valueOf("0")).as("pntrNo"), review.createAt)
                )
                .from(review)
                .innerJoin(review.store, store)
                .where(review.store.no.eq(restaurantNo))
                .orderBy(review.no.asc(), review.pntrNo.coalesce(review.no).desc())
                .fetch();
    }

}
