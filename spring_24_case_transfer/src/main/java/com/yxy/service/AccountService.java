package com.yxy.service;

import com.yxy.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AccountService {
    /**
     * 转账操作
     * @param out
     * @param in
     * @param money
     */
    /// 这个注解表示开启spring事务
    @Transactional
    void transfer(String out, String in, Double money);

    List<Account> findAll();
}
