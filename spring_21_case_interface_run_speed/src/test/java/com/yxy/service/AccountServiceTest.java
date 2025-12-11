package com.yxy.service;

import com.yxy.config.SpringConfig;
import com.yxy.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById() {
        Account byId = accountService.findById(1);
    }

    @Test
    public void testFindByAll() {
        List<Account> all = accountService.findAll();
    }

}
