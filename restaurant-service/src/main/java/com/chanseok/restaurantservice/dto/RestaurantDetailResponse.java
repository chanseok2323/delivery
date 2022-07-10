package com.chanseok.restaurantservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class RestaurantDetailResponse {
    private Long restaurantNo;
    private String restaurantName;
    private List<MenuDto> menus;

    private RestaurantDetailResponse(Long restaurantNo, String restaurantName, List<MenuDto> menus) {
        this.restaurantNo = restaurantNo;
        this.restaurantName = restaurantName;
        this.menus = menus;
    }

    public static RestaurantDetailResponse of(Long restaurantNo, String restaurantName, List<MenuDto> menus) {
        return new RestaurantDetailResponse(restaurantNo, restaurantName, menus);
    }
}
