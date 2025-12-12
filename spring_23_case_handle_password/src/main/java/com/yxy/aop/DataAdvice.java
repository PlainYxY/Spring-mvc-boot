package com.yxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataAdvice {

    @Pointcut("execution(* com.yxy.service.*Service.openURL(..))")
    public void ServicePt(){}

    @Around("DataAdvice.ServicePt()")
    public Object trimStr(ProceedingJoinPoint jp) throws Throwable {
        Object[] args = jp.getArgs();

        for (int i = 0; i < args.length; i++) {
            if (args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();
            }
        }

        Object proceed = jp.proceed(args);
        return proceed;
    }
}
