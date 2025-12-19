package com.yxy.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    // @ExceptionHandler(value = Exception.class)
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        System.out.println("这是一个异常捕捉");
        return new Result(666,null,"这是一个异常捕捉");
    }
}
