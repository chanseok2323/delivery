package com.chanseok.restaurantservice.repository.custom;

import com.chanseok.restaurantservice.dto.MenuDto;

import java.util.List;

public interface RestaurantRepositoryCustom {
    List<MenuDto> findByRestaurantNo(Long no);
}
