package com.yxy;

import com.yxy.config.SpringConfig;
import com.yxy.domain.Account;
import com.yxy.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService bean = context.getBean(AccountService.class);
        Account byId = bean.findById(1);
        System.out.println(byId);
    }
}