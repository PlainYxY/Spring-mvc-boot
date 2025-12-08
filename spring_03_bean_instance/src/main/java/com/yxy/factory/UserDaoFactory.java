package com.yxy.factory;

import com.yxy.dao.UserDao;
import com.yxy.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        System.out.println("UserDaoFactory");
        return new UserDaoImpl();
    }
}
