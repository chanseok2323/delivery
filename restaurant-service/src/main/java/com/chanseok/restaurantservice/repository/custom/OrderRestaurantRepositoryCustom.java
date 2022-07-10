package com.chanseok.restaurantservice.repository.custom;

import com.chanseok.restaurantservice.dto.CreateReviewRequest;
import com.chanseok.restaurantservice.entity.OrderRestaurant;

import java.util.Optional;

public interface OrderRestaurantRepositoryCustom {
    Optional<OrderRestaurant> findByOrderRestaurant(CreateReviewRequest createReviewRequest);
}
