package com.yxy.service.impl;

import com.yxy.dao.AccountDao;
import com.yxy.domain.Account;
import com.yxy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out,money);

        // 故意制造一个异常组织另一个方法执行

        accountDao.inMoney(in,money);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAllAccount();
    }
}
