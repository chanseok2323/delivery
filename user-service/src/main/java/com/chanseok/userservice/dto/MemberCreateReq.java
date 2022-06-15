package com.chanseok.userservice.dto;

import com.chanseok.userservice.entity.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberCreateReq {
    private String email;
    private String password;
    private String nickname;
    private String phone;

    @Builder
    public MemberCreateReq(String email, String password, String nickname, String phone) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.phone = phone;
    }

    public Member ofMember() {
        return Member.builder()
                .email(this.email)
                .password(this.password)
                .nickname(this.nickname)
                .phone(this.phone)
                .build();
    }
}
