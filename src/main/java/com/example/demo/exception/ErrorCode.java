package com.example.demo.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {

    USER_ALREADY_EXIST(HttpStatus.BAD_REQUEST, "�̹� �����ϴ� ����� �Դϴ�."),
    USER_NOT_FOUND(HttpStatus.BAD_REQUEST, "�������� �ʴ� ����� �Դϴ�.");


    private String message;
    private HttpStatus status;

    ErrorCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
