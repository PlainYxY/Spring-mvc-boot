package com.yxy.factory;

import com.yxy.dao.UserDao;
import com.yxy.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {

    // 代替原始实例工厂创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    //控制FactoryBean是否是单例bean的方法，ture为是，false为否
    @Override
    public boolean isSingleton() {
        return true;
    }
}
