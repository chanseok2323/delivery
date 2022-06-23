package com.chanseok.restaurantservice.repository;

import com.chanseok.restaurantservice.dto.MenuDto;

import java.util.List;

public interface CustomRestaurantRepository {
    List<MenuDto> findByRestaurantNo(Long no);
}
