package com.yxy.dao.impl;

import com.yxy.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourcesDaoImpl implements ResourcesDao {

    public boolean openURL(String url, String password) {
        return password.equals("root");
    }
}
