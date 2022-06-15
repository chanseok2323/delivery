package com.chanseok.userservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class SignUpReq {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 8, message = "최소 8자리 이상 입력해주세요.")
    private String password;

    @NotBlank
    private String nickname;

    @NotBlank
    private String phone;

    public SignUpReq(String email, String password, String nickname, String phone) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.phone = phone;
    }

    public MemberCreateReq ofMemberCreateReq() {
        return MemberCreateReq.builder()
                .email(this.email)
                .password(this.password)
                .nickname(this.nickname)
                .phone(this.phone)
                .build();
    }
}
