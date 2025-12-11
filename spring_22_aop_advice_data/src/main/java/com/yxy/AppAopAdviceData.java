package com.yxy;

import com.yxy.config.SpringConfig;
import com.yxy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAopAdviceData {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = ac.getBean(BookDao.class);
        // bean.findName(1 ,"1234");
        String value = bean.findName(1 ,"1234");
        System.out.println(value);
    }
}
