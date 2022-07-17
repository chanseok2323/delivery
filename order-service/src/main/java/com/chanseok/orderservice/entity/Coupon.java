package com.chanseok.orderservice.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Entity
public class Coupon extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coupon_no")
    private Long no;

    @Column(name = "coupon_name")
    private String name;
    private String contents;
    private Date startDay;
    private Date endDay;
    private Boolean expired;

    protected Coupon() {
    }

    public Coupon(String name, String contents, Date startDay, Date endDay, Boolean expired) {
        this.name = name;
        this.contents = contents;
        this.startDay = startDay;
        this.endDay = endDay;
        this.expired = expired;
    }
}
