package com.example.demo.dto;

import com.example.demo.entity.Member;
import lombok.*;

@Data
@Builder
public class ResponseRegistDto {

    private String id;
    private String pw;

    public static ResponseRegistDto fromEntity(Member member) {
        return ResponseRegistDto.builder()
                .id(member.getUserId())
                .pw(member.getPw())
                .build();
    }

}
