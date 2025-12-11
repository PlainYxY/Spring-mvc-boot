package com.yxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {

    @Pointcut("execution(* com.yxy.service.*Service.*(..))")
    public void servicePt(){}

    @Around("ProjectAdvice.servicePt()")
    public void runSteep(ProceedingJoinPoint pjp) throws Throwable{

        // 知识点
        // 这是连接点方法(ProceedingJoinPoint)执行的签名信息
        Signature signature = pjp.getSignature();
        // 通过签名获取执行类型
        String className = signature.getDeclaringTypeName();
        // 通过签名获取执行方法名
        String methodName = signature.getName();


        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            Object proceed = pjp.proceed();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("万次执行 " +className+ " 类下的 " +methodName+ " 方法的时间为 " + (endTime - startTime)+ " ms");
    }
}
