package com.yxy.dao.impl;

import com.yxy.dao.BookDao;

public class BookDaoImpl implements BookDao {

    int count;
    String dataBaseName;

    public void save() {
        System.out.println("book dao save" + "," + dataBaseName + "," + count);
    }

    public BookDaoImpl(int count, String dataBase) {
        this.count = count;
        this.dataBaseName = dataBase;
    }
}
