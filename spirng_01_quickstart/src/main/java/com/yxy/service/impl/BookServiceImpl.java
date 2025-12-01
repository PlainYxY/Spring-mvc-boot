package com.yxy.service.impl;

import com.yxy.dao.BookDao;
import com.yxy.service.BookService;

public class BookServiceImpl implements BookService {

    // 5.删除业务层中使用new的方式创建Dao对象
    // BookDao bookDao = new BookDaoImpl();
    BookDao bookDao;
    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }

    // 6.提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
