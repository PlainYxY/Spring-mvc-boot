package com.yxy;

import com.yxy.config.SpringConfig;
import com.yxy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAopAdvice {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = ac.getBean(BookDao.class);
        // bean.update();
        int i = bean.select();
        System.out.println(i);
    }
}