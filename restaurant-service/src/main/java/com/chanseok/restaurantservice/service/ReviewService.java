package com.chanseok.restaurantservice.service;

import com.chanseok.restaurantservice.dto.CreateReviewRequest;
import com.chanseok.restaurantservice.dto.ReviewsResponse;
import com.chanseok.restaurantservice.entity.OrderRestaurant;
import com.chanseok.restaurantservice.entity.Review;
import com.chanseok.restaurantservice.repository.OrderRestaurantRepository;
import com.chanseok.restaurantservice.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final OrderRestaurantRepository orderRestaurantRepository;

    public void save(CreateReviewRequest createReviewRequest) {
        OrderRestaurant orderRestaurant =
                orderRestaurantRepository.findByOrderRestaurant(
                        createReviewRequest).orElseThrow(() -> new IllegalArgumentException("주문을 하지 않은 사용자 입니다.")
                );

        reviewRepository.save(new Review(orderRestaurant.getRestaurant(), createReviewRequest.getComments(), createReviewRequest.getRecommend()));
    }

    public List<ReviewsResponse> findByNo(Long restaurantNo) {
        return reviewRepository.findByNo(restaurantNo);
    }

}
