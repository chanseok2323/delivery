package com.chanseok.restaurantservice.repository;

import com.chanseok.restaurantservice.entity.Restaurant;
import com.chanseok.restaurantservice.repository.custom.RestaurantRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>, RestaurantRepositoryCustom {
    Optional<Restaurant> findByNo(Long no);
}
