package com.chanseok.userservice.service;

import com.chanseok.userservice.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class MemberServiceTest {

    @Mock
    private MemberRepository memberRepository;

    @InjectMocks
    private MemberService memberService;

    @Test
    void 이메일로_조회_시_데이터가_없을경우_에러발생() {
        //given
        given(memberRepository.findByEmail(anyString()))
                .willReturn(Optional.empty());

        //then
        assertThrows(IllegalArgumentException.class, () -> {
            memberService.findByEmail("test");
        });
    }
}