package com.chanseok.userservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ResponseMember {
    private String email;
    private String password;
    private String nickname;
    private String phone;
}
