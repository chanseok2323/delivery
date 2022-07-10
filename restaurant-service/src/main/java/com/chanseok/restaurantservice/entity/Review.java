package com.chanseok.restaurantservice.entity;

import lombok.Builder;
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
    private Long pntrNo;
    private Integer taps;

    public Review(Restaurant restaurant, String comments, Integer recommend) {
        this.restaurant = restaurant;
        this.comments = comments;
        this.recommend = recommend;
    }
}
