package com.yxy.dao.impl;

import com.yxy.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save");
    }
}
