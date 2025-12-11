package com.yxy.dao.impl;

import com.yxy.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id ,String password) {
        System.out.println("id:" +id);
        return "yxy";
    }
}
