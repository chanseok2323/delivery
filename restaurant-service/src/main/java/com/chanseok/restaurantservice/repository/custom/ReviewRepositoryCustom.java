package com.chanseok.restaurantservice.repository.custom;

import com.chanseok.restaurantservice.dto.ReviewsResponse;

import java.util.List;

public interface ReviewRepositoryCustom {
    List<ReviewsResponse> findByNo(Long restaurantNo);
}
