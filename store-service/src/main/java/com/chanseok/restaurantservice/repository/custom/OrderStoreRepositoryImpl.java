package com.chanseok.restaurantservice.repository.custom;

import com.chanseok.restaurantservice.dto.CreateReviewRequest;
import com.chanseok.restaurantservice.entity.OrderStore;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.chanseok.restaurantservice.entity.QOrderStore.*;

@Repository
@RequiredArgsConstructor
public class OrderStoreRepositoryImpl implements OrderStoreCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Optional<OrderStore> findByOrderStore(CreateReviewRequest createReviewRequest) {
        return Optional.ofNullable(
                jpaQueryFactory.select(orderStore)
                        .from(orderStore)
                        .where(
                                orderStore.store.no.eq(createReviewRequest.getStoreNo())
                                        .and(orderStore.orderNo.eq(createReviewRequest.getOrderNo()))
                        )
                        .fetchOne()
        );
    }
}
