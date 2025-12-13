package com.yxy.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {
    /// 注解后面括号内(propagation = ...)表示开启 事务的传播行为
    /// (propagation = Propagation.REQUIRES_NEW) 这个表示开启一个新的事务，不受其他事务回滚的影响（其他详见图片）
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(String out, String in, Double money);
}
