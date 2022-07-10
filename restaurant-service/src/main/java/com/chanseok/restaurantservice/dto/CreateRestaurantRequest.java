package com.chanseok.restaurantservice.dto;

import com.chanseok.restaurantservice.entity.Restaurant;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter @Setter
public class CreateRestaurantRequest {
    private String name;
    private String location;
    private String locationDetail;
    private Time startBusinessTime;
    private Time endBusinessTime;

    protected CreateRestaurantRequest() {
    }

    public CreateRestaurantRequest(String name, String location, String locationDetail, Time startBusinessTime, Time endBusinessTime) {
        this.name = name;
        this.location = location;
        this.locationDetail = locationDetail;
        this.startBusinessTime = startBusinessTime;
        this.endBusinessTime = endBusinessTime;
    }

    public static CreateRestaurantRequest of(Restaurant restaurant) {
        return new CreateRestaurantRequest(restaurant.getName()
                , restaurant.getLocation()
                , restaurant.getLocationDetail()
                , restaurant.getStartBusinessTime()
                , restaurant.getEndBusinessTime()
        );
    }
}
