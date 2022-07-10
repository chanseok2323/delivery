package com.chanseok.restaurantservice.entity;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Entity
public class OrderRestaurant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_restaurant_no")
    private Long no;

    @ManyToOne(fetch = FetchType.LAZY)
    private Restaurant restaurant;
    private Long orderNo;
    private Long orderUser;
    private String orderMenu;
    private BigDecimal price;
    private String address;
    private String requests;
    private Integer paymentYn;

}
