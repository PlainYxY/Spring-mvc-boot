package com.yxy.service.impl;

import com.yxy.dao.BookDao;
import com.yxy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    // 这个注解实现 依赖注入
    @Autowired
    // 这个注解可以在有多个相同数据层实现里根据 名称选择对应的bean
    @Qualifier("bookDao2")
    BookDao bookDao;

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }
}
