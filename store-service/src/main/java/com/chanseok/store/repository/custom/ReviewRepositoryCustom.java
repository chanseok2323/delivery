package com.chanseok.store.repository.custom;

import com.chanseok.store.dto.ReviewsResponse;

import java.util.List;

public interface ReviewRepositoryCustom {
    List<ReviewsResponse> findByNo(Long restaurantNo);
}
