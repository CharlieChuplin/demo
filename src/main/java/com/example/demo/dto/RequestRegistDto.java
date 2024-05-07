package com.example.demo.dto;

import com.example.demo.entity.Member;
import lombok.*;

@Data
public class RequestRegistDto {

    private String id;
    private String pw;
    private String name;

    public Member toEntity(RequestRegistDto dto) {
        return Member.builder()
                .userId(dto.getId())
                .pw(dto.getPw())
                .name(dto.getName())
                .build();
    }

}
