package com.yxy;

import com.yxy.config.SpringConfig;
import com.yxy.dao.AccountDao;
import com.yxy.domain.Account;
import com.yxy.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMybatis2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);

        Account ac = accountService.findById(2);
        System.out.println(ac);


        // AccountDao accountDao = ctx.getBean(AccountDao.class);
        // Account byId = accountDao.findById(1);
        // System.out.println(byId);
    }
}
