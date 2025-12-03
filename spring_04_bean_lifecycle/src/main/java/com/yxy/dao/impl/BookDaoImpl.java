package com.yxy.dao.impl;

import com.yxy.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save");
    }

    public void init() {
        System.out.println("init...");
    }

    public void destory() {
        System.out.println("destory...");
    }
}
