package com.example.demo.entity;

import com.example.demo.dto.RequestRegistDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id // pk
    @GeneratedValue(strategy = GenerationType.AUTO) //자동생성
    private Long id;

    private String userId;
    private String pw;
    private String name;

}
