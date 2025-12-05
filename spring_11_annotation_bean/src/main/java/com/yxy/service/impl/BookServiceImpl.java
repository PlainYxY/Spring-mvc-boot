package com.yxy.service.impl;

import com.yxy.dao.BookDao;
import com.yxy.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
public class BookServiceImpl implements BookService {

    BookDao bookDao;

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
