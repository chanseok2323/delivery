package com.chanseok.restaurantservice.repository.custom;

import com.chanseok.restaurantservice.dto.CreateReviewRequest;
import com.chanseok.restaurantservice.entity.OrderRestaurant;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.chanseok.restaurantservice.entity.QOrderRestaurant.orderRestaurant;

@Repository
@RequiredArgsConstructor
public class OrderRestaurantRepositoryImpl {

    private final JPAQueryFactory jpaQueryFactory;

    public Optional<OrderRestaurant> findByOrderRestaurant(CreateReviewRequest createReviewRequest) {
        return Optional.ofNullable(
                jpaQueryFactory.select(orderRestaurant)
                        .from(orderRestaurant)
                        .where(
                                orderRestaurant.restaurant.no.eq(createReviewRequest.getRestaurantNo())
                                .and(orderRestaurant.orderNo.eq(createReviewRequest.getOrderNo()))
                        )
                        .fetchOne()
        );
    }
}
