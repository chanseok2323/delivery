package com.chanseok.restaurantservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class MenuDto {
    private Long no;
    private String name;
    private BigDecimal price;
    private String comments;
}
