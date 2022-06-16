package com.chanseok.restaurantservice.entity;

import javax.persistence.*;

@Entity
public class Restaurant extends BaseEntity {

    @Column(name = "restaurant_no")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;
    private String name;
    private String location;
    private String locationDetail;

}
