package com.yxy.dao.impl;

import com.yxy.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @Component("bookDao")
@Repository("bookDao")
// 单例
@Scope("singleton")
// 多例
// @Scope("prototype")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save");
    }
    // 注解翻译是 构造方法后
    @PostConstruct
    public void init() {
        System.out.println("book init");
    }
    // 注解翻译是 销毁之前
    @PreDestroy
    public void destroy() {
        System.out.println("book destroy");
    }
}
