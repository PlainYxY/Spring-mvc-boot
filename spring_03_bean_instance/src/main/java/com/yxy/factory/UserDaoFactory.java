package com.yxy.factory;

import com.yxy.dao.UserDao;
import com.yxy.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
