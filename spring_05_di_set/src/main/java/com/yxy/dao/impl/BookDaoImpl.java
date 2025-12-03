package com.yxy.dao.impl;

import com.yxy.dao.BookDao;

public class BookDaoImpl implements BookDao {

    int count;
    String dataBaseName;

    public void save() {
        System.out.println("book dao save" + ","  + count + "," + dataBaseName);
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }
}
