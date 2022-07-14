package com.chanseok.store.repository.custom;

import com.chanseok.store.dto.CreateReviewRequest;
import com.chanseok.store.entity.OrderStore;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.chanseok.store.entity.QOrderStore.*;

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
