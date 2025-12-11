package com.yxy.dao.impl;

import com.yxy.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public int select() {
        System.out.println("bookDao select");
        return 100;
    }

    public void update() {
        System.out.println("bookDao update");
    }
}
