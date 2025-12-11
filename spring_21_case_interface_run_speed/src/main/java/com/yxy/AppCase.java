package com.yxy;

import com.yxy.config.SpringConfig;
import com.yxy.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCase {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDao bean = ac.getBean(AccountDao.class);
        System.out.println(bean.findById(1));
    }
}
