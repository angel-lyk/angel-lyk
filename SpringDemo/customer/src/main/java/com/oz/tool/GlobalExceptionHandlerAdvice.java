package com.oz.tool;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {
    @ExceptionHandler(Throwable.class)
    public String buildException(Exception ex) {
        return ex.getMessage();
    }
}
