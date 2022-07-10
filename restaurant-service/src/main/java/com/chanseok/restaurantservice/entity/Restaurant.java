package com.chanseok.restaurantservice.entity;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Getter
public class Restaurant extends BaseEntity {

    @Column(name = "restaurant_no")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;
    private String name;
    private String location;
    private String locationDetail;
    private Time startBusinessTime;
    private Time endBusinessTime;

    protected Restaurant() {
    }

    public Restaurant(String name, String location, String locationDetail, Time startBusinessTime, Time endBusinessTime) {
        this.name = name;
        this.location = location;
        this.locationDetail = locationDetail;
        this.startBusinessTime = startBusinessTime;
        this.endBusinessTime = endBusinessTime;
    }

}
