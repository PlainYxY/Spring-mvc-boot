package com.yxy.service.impl;

import com.yxy.dao.AccountDao;
import com.yxy.dao.LogDao;
import com.yxy.domain.Account;
import com.yxy.service.AccountService;
import com.yxy.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    @Override
    public void transfer(String out, String in, Double money){

        try {
            accountDao.outMoney(out,money);

            // 故意制造一个异常组织另一个方法执行
            int i = 1/0;
            // if (true)throw new IOException();

            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);
        }
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAllAccount();
    }
}
