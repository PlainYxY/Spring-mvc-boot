package com.yxy.service.impl;

import com.yxy.dao.BookDao;
import com.yxy.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }
}
