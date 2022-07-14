package com.chanseok.store.repository;

import com.chanseok.store.entity.Review;
import com.chanseok.store.repository.custom.ReviewRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
}
