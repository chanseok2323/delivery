package com.chanseok.restaurantservice.repository;

import com.chanseok.restaurantservice.entity.Review;
import com.chanseok.restaurantservice.repository.custom.ReviewRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
}
