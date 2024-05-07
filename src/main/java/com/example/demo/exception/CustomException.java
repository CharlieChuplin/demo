package com.example.demo.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    String message;
    ErrorCode errorCode;

    public CustomException(String message, ErrorCode errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

}
