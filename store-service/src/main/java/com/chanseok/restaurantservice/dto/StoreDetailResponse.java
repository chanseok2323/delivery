package com.chanseok.restaurantservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class StoreDetailResponse {
    private Long storeNo;
    private String restaurantName;
    private List<MenuDto> menus;

    private StoreDetailResponse(Long storeNo, String restaurantName, List<MenuDto> menus) {
        this.storeNo = storeNo;
        this.restaurantName = restaurantName;
        this.menus = menus;
    }

    public static StoreDetailResponse of(Long storeNo, String restaurantName, List<MenuDto> menus) {
        return new StoreDetailResponse(storeNo, restaurantName, menus);
    }
}
