package com.chanseok.restaurantservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MenuDto {
    private Long no;
    private String name;
    private Integer price;
    private String comments;
}
