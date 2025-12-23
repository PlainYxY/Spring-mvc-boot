package com.yxy.controller;

import com.yxy.exception.BusinessException;
import com.yxy.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    // 自定义的处理 系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员（把ex对象返回给开发）
        return new  Result(ex.getCode(), null, ex.getMessage());
    }

    // 自定义的处理 业务异常
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex) {
        return new  Result(ex.getCode(), null, ex.getMessage());
    }



    // 处理 系统未知的异常异常（通常返回友好消息（返回那种安抚客户的消息））
    // @ExceptionHandler(value = Exception.class)
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员（把ex对象返回给开发）
        System.out.println("这是一个异常捕捉");
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"这是一个未知的系统异常捕捉");
    }
}
