package com.chanseok.restaurantservice.dto;

import com.chanseok.restaurantservice.entity.Restaurant;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RestaurantDto {
    private Long no;
    private String name;
    private String location;
    private String locationDetail;

    private RestaurantDto(Long no, String name, String location, String locationDetail) {
        this.no = no;
        this.name = name;
        this.location = location;
        this.locationDetail = locationDetail;
    }

    public static RestaurantDto of(Restaurant restaurant) {
        return new RestaurantDto(restaurant.getNo(), restaurant.getName(), restaurant.getLocation(), restaurant.getLocationDetail());
    }
}
