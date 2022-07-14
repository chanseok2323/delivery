package com.chanseok.store.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Review extends BaseEntity {

    @Column(name = "review_no")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_no")
    private Store store;

    private String comments;
    private Integer recommend;
    private Long pntrNo;
    private Integer taps;

    public Review(Store store, String comments, Integer recommend) {
        this.store = store;
        this.comments = comments;
        this.recommend = recommend;
    }

    protected Review() {

    }
}
