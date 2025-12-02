package com.yxy.dao.impl;

import com.yxy.dao.BookDao;

public class BookDaoImpl implements BookDao {

    // 1.构造方法实例化bean (也可以不写，默认就有)
    public BookDaoImpl() {
        System.out.println("constructor is running");
    }

    public void save(){
        System.out.println("bookDaoImpl save");
    }
}
