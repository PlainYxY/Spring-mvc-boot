package com.yxy;

import com.yxy.dao.BookDao;
import com.yxy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 方式二也可以放到这里
        ac.registerShutdownHook();

        BookDao bookDao = (BookDao) ac.getBean("bookDao1");
        bookDao.save();

        // 关闭方式一、直接暴力关闭容器 (只在单例模式下管用)
        // ac.close();

        // 关闭方式二、设置关闭钩子 (只在单例模式下管用)
        // ac.registerShutdownHook();
    }
}
