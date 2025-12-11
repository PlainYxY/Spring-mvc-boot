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
    ///知识点： 对于@Before或者@After注释，使用JoinPoint jp 获取调用原始方法的参数
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice");
    }


    // @Around("pt()")
    ///知识点： 对于@Around注释，使用ProceedingJoinPoint pjp 获取调用原始方法的参数
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));

        args[0] = 666;

        /// 知识点：以上获取到通知数据后,还可以经过修改,然后通过.proceed(args),再传回切点方法
        Object proceed = pjp.proceed(args);
        return proceed;

        // 用try-catch块可以拿到异常信息
        // Object proceed = null;
        // try {
        //     proceed = pjp.proceed(args);
        // } catch (Throwable t) {
        //     throw new RuntimeException(t);
        // }
        // return proceed;
    }

    /// 这个注解用如下方式接受返回值
    @AfterReturning(value = "pt()",returning = "ref")
    // 如果 JoinPoint参数和其他参数一起出现在形参中，则它必须是第一个，不然会报错
    public void afterReturning(JoinPoint jp, String ref) {
        System.out.println("afterReturning advice " + ref);
    }

    // @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice" + t);
    }
}
