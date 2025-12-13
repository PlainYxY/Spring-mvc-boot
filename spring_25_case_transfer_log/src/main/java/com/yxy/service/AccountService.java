package com.yxy.service;

import com.yxy.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

public interface AccountService {
    /**
     * 转账操作
     * @param out
     * @param in
     * @param money
     */
    // IOException 异常，默认不参与回滚,这时候就需要在注解后添加如下属性来设置遇到该事务也执行回滚
    // @Transactional(rollbackFor = IOException.class)
    /// 这个注解表示开启spring事务
    @Transactional(rollbackFor = IOException.class)
    void transfer(String out, String in, Double money);

    List<Account> findAll();
}
