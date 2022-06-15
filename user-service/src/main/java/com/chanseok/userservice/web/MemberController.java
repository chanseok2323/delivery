package com.chanseok.userservice.web;

import com.chanseok.userservice.dto.ResponseMember;
import com.chanseok.userservice.dto.SignUpReq;
import com.chanseok.userservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/users")
    public ResponseMember findUser() {
        return null;
    }

    @PostMapping("/users")
    public ResponseEntity<Void> signUp(@Valid @RequestBody SignUpReq signUpReq) {
        memberService.signUp(signUpReq.ofMemberCreateReq());
        return ResponseEntity.ok().build();
    }
}
