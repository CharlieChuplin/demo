package com.example.demo.service;

import com.example.demo.dto.RequestRegistDto;
import com.example.demo.dto.ResponseRegistDto;
import com.example.demo.entity.Member;
import com.example.demo.exception.CustomException;
import com.example.demo.exception.ErrorCode;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public ResponseRegistDto regist(RequestRegistDto dto) {

        String userId = dto.getId();

        Member founMember = memberRepository.findByUserId(userId)
                .orElseThrow(() -> new CustomException("Member not found", ErrorCode.USER_ALREADY_EXIST));

        // dto -> entity
        Member newMember = dto.toEntity(dto);

        // entity 저장
        Member savedMember = memberRepository.save(newMember);

        // entity -> dto
        return ResponseRegistDto.fromEntity(savedMember);
    }
}
