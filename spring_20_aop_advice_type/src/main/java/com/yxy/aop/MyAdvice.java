package com.yxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.yxy.*.*Dao.update(..))")
    private void pt(){}
    @Pointcut("execution(* com.yxy.*.*Dao.select(..))")
    private void pt2(){}

    // 切点方法之前
    // @Before("pt()")
    public void before() {
        System.out.println("before advice");
    }

    // 切点方法之后
    // @After("pt2()")
    public void after() {
        System.out.println("after advice");
    }

    // 环绕(切点方法)通知(必须依赖形参ProceedingJoinPoint 才能实现对原始方法的调用)  （重点，该方式可以想办法实现其他四种通知方法）
    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice");

        // 表示对原始方法的调用
        Object proceed = pjp.proceed();

        System.out.println("around after advice");
        /// 知识点：如果原始方法有返回值，则需要通过 该通知方法给扔出去 原切点方法的返回值，成了pjp.proceed();的返回值 如果返回void 则会报错
        return proceed;
    }
    // 环绕切点方法
    // @Around("pt()")
    // public void around2(ProceedingJoinPoint pjp) throws Throwable {
    //     System.out.println("around before advice");
    //     // 表示对原始方法的调用
    //     pjp.proceed();
    //     System.out.println("around after advice");
    // }

    // 切点方法成功运行完后，才会执行这个 通知方法 （比如原始方法抛异常就不执行该动作）（不怎么用）
    // @AfterReturning("pt2()")
    public void afterReturning() {
        System.out.println("afterReturning advice");
    }

    // 抛出异常后通知
    // @AfterThrowing("pt2()")
    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println("afterThrowing advice");
    }
}
