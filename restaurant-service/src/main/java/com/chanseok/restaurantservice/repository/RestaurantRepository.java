package com.chanseok.restaurantservice.repository;

import com.chanseok.restaurantservice.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>, CustomRestaurantRepository {
    Optional<Restaurant> findByNo(Long no);
}