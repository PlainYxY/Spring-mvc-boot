package com.yxy.dao;

import com.yxy.domain.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {

    @Insert("insert into tab_user (name,age) values (#{name},#{age})")
    void save(User user);
}
