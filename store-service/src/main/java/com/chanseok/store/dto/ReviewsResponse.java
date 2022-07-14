package com.chanseok.store.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class ReviewsResponse {
    private Long no;
    private String name;
    private String comments;
    private Integer recommend;
    private Integer taps;
    private Long pntrNo;
    private LocalDateTime createAt;

    public ReviewsResponse() {
    }

    public ReviewsResponse(Long no, String name, String comments, Integer recommend, Integer taps, Long pntrNo, LocalDateTime createAt) {
        this.no = no;
        this.name = name;
        this.comments = comments;
        this.recommend = recommend;
        this.taps = taps;
        this.pntrNo = pntrNo;
        this.createAt = createAt;
    }
}
