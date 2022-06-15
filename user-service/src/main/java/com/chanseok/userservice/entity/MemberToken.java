package com.chanseok.userservice.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class MemberToken extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_token_no")
    private Long no;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_no")
    private Member member;
    private String email;
    private String accessToken;
    private String refreshToken;

}
