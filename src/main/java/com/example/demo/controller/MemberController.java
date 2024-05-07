package com.example.demo.controller;

import com.example.demo.dto.RequestRegistDto;
import com.example.demo.dto.ResponseRegistDto;
import com.example.demo.exception.CustomException;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
@Slf4j
public class MemberController {

    //클라이언트의 요청을 받는 역할 만을 할 뿐 그외 역할하지않는다.

    private final MemberService memberService;

    @PostMapping("/regist")
    public ResponseRegistDto regist(@RequestBody RequestRegistDto dto) {

        log.info("회원가입 정보 : {}", dto);

        return memberService.regist(dto);
    }

    @ExceptionHandler(value = CustomException.class)
    public void exception(Exception e) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
    }
}
