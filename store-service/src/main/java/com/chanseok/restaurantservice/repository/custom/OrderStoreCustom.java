package com.chanseok.restaurantservice.repository.custom;

import com.chanseok.restaurantservice.dto.CreateReviewRequest;
import com.chanseok.restaurantservice.entity.OrderStore;

import java.util.Optional;

public interface OrderStoreCustom {
    Optional<OrderStore> findByOrderStore(CreateReviewRequest createReviewRequest);
}
