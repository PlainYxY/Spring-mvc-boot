package com.yxy.dao.impl;

import com.yxy.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save");
    }
}
