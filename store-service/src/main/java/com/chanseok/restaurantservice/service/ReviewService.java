package com.chanseok.restaurantservice.service;

import com.chanseok.restaurantservice.dto.CreateReviewRequest;
import com.chanseok.restaurantservice.dto.ReviewsResponse;
import com.chanseok.restaurantservice.entity.OrderStore;
import com.chanseok.restaurantservice.entity.Review;
import com.chanseok.restaurantservice.repository.OrderStoreRepository;
import com.chanseok.restaurantservice.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final OrderStoreRepository orderStoreRepository;

    public void save(CreateReviewRequest createReviewRequest) {
        OrderStore orderRestaurant =
                orderStoreRepository.findByOrderStore(
                        createReviewRequest).orElseThrow(() -> new IllegalArgumentException("주문을 하지 않은 사용자 입니다.")
                );

        reviewRepository.save(new Review(orderRestaurant.getStore(), createReviewRequest.getComments(), createReviewRequest.getRecommend()));
    }

    public List<ReviewsResponse> findByNo(Long restaurantNo) {
        return reviewRepository.findByNo(restaurantNo);
    }

}

