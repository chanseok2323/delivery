package com.chanseok.restaurantservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateReviewRequest {
    private Long storeNo;
    private Long orderNo;
    private Long memberNo;
    private String comments;
    private Integer recommend;

    public CreateReviewRequest(Long storeNo, Long orderNo, Long memberNo, String comments, Integer recommend) {
        this.storeNo = storeNo;
        this.orderNo = orderNo;
        this.memberNo = memberNo;
        this.comments = comments;
        this.recommend = recommend;
    }
}
