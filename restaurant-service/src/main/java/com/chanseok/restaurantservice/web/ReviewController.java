package com.chanseok.restaurantservice.web;

import com.chanseok.restaurantservice.dto.CreateReviewRequest;
import com.chanseok.restaurantservice.dto.ReviewsResponse;
import com.chanseok.restaurantservice.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Void> save(CreateReviewRequest createReviewRequest) {
        reviewService.save(createReviewRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping({"/{no}"})
    public List<ReviewsResponse> findByNo(@PathVariable Long no) {
        return reviewService.getReview(no);
    }
}
