package com.chanseok.restaurantservice.repository;

import com.chanseok.restaurantservice.entity.OrderRestaurant;
import com.chanseok.restaurantservice.repository.custom.OrderRestaurantRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRestaurantRepository extends JpaRepository<OrderRestaurant, Long>, OrderRestaurantRepositoryCustom {
}
