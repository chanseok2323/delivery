package com.chanseok.userservice.service;

import com.chanseok.userservice.dto.MemberCreateReq;
import com.chanseok.userservice.entity.Member;
import com.chanseok.userservice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void signUp(MemberCreateReq memberReq) {
        memberRepository.save(memberReq.ofMember());
    }

    public Member findByEmail(String email) {
        return memberRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("에러발생"));
    }
}
