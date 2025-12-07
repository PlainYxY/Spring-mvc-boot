package com.yxy.service.impl;

import com.yxy.dao.BookDao;
import com.yxy.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// 方式二（生命周期）实现 InitializingBean, DisposableBean 注解
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    BookDao bookDao;

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("book service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("book service init");
    }
}
