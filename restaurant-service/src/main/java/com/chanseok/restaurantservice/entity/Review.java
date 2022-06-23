package com.chanseok.restaurantservice.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Review extends BaseEntity {

    @Column(name = "review_no")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_no")
    private Restaurant restaurant;

    private String comments;
    private Integer recommend;

}
