package com.chanseok.restaurantservice.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Restaurant extends BaseEntity {

    @Column(name = "restaurant_no")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;
    private String name;
    private String location;
    private String locationDetail;

    protected Restaurant() {
    }

    public Restaurant(String name, String location, String locationDetail) {
        this.name = name;
        this.location = location;
        this.locationDetail = locationDetail;
    }

}
