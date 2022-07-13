package com.chanseok.restaurantservice.entity;

import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Setter
public class Menu extends BaseEntity {

    @Column(name = "menu_no")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_no")
    private Restaurant restaurant;

    @Column(name = "menu_name")
    private String name;
    private BigDecimal price;
    private String comments;
}
