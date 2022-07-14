package com.chanseok.restaurantservice.service;

import com.chanseok.restaurantservice.dto.CreateReviewRequest;
import com.chanseok.restaurantservice.repository.OrderStoreRepository;
import com.chanseok.restaurantservice.repository.ReviewRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class ReviewServiceTest {

    @Mock
    private ReviewRepository reviewRepository;

    @Mock
    private OrderStoreRepository orderStoreRepository;

    @InjectMocks
    private ReviewService reviewService;

    @Test
    void 주문한_고객이_아니면_리뷰를_작성할수없다() {
        // given
        CreateReviewRequest createReviewRequest = new CreateReviewRequest(1L, 23L, 3L, "맛있어요", 5);
        given(orderStoreRepository.findByOrderStore(createReviewRequest)).willReturn(Optional.empty());

        // when

        // then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            reviewService.save(createReviewRequest);
        });
    }
}