package com.yxy.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// @Component 注册为一个bean
@Component
// @Aspect（切面） 不要把这个类当普通bean，要当AOP处理
@Aspect
public class MyAdvice {

    // 定义一个切入点
    @Pointcut("execution(void com.yxy.dao.BookDao.update())")
    private void pt(){}

    // @Before 表示method()方法执行在pt()方法标出的注解里那个切点方法 执行之前 @After表示之后
    // @Before("pt()")
    @After("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
