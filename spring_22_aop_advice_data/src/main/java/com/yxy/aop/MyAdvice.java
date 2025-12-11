package com.yxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.yxy.dao.BookDao.findName(..))")
    private void pt(){}

    // @Before("pt()")
    public void before(JoinPoint jp) {
        // 切面类的 通知方法 形参中的 JoinPoint 可以获取到传输的数据,也是切点方法内部的形参数据,以数组方式呈现,用getArgs()方法
        // System.out.println(pjp.proceed());
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice");
    }

    // @After("pt()")
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice");
    }

    // @Around("pt()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));

        args[0] = 666;

        /// 知识点：以上获取到通知数据后,还可以经过修改,然后通过.proceed(args),再传回切点方法
        Object proceed = pjp.proceed(args);
        return proceed;
    }

    // 这个注解用如下方式接受返回值
    @AfterReturning(value = "pt()",returning = "ref")
    public void afterReturning(Object ref) {
        System.out.println("afterReturning advice " + ref);
    }

    // @AfterThrowing("pt()")
    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println("afterThrowing advice");
    }
}
