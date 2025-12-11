package com.yxy.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    /// 知识点
    // 可以写接口位置 （一般用这个，因为解耦，描述到实现类就紧耦合了）
    // @Pointcut("execution(void com.yxy.dao.BookDao.update())")
    // 也可以写接口实现类位置
    // @Pointcut("execution(void com.yxy.dao.impl.BookDaoImpl.update())")

    // 标准的通配符写法 （返回类型用*，中间的包名用*，类名前缀用*，方法名后缀用*，返回参数用..（表不确定个数））
    // @Pointcut("execution(* com.yxy.*.*Service.find*(..))")

    @Pointcut("execution(* com.yxy.*.*Dao.update(..))")
    private void pt(){}

    @After("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
