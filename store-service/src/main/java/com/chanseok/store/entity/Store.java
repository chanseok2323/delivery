package com.chanseok.store.entity;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Getter
public class Store extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_no")
    private Long no;
    private String name;
    private String location;
    private String locationDetail;
    private Time startBusinessTime;
    private Time endBusinessTime;

    protected Store() {
    }

    public Store(String name, String location, String locationDetail, Time startBusinessTime, Time endBusinessTime) {
        this.name = name;
        this.location = location;
        this.locationDetail = locationDetail;
        this.startBusinessTime = startBusinessTime;
        this.endBusinessTime = endBusinessTime;
    }
}
