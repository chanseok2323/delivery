package com.chanseok.store.repository.custom;

import com.chanseok.store.dto.CreateReviewRequest;
import com.chanseok.store.entity.OrderStore;

import java.util.Optional;

public interface OrderStoreCustom {
    Optional<OrderStore> findByOrderStore(CreateReviewRequest createReviewRequest);
}
