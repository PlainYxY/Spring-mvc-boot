package com.yxy.service.impl;

import com.yxy.dao.BookDao;
import com.yxy.dao.UserDao;
import com.yxy.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private UserDao userDao;

    public void save(){
        System.out.println("book service save");
        bookDao.save();
        userDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
