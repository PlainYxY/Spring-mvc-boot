package com.yxy.dao;

import com.yxy.domain.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AccountDao {

    @Update("update tab_account set money = money + #{money} where name = #{name} ")
    void inMoney(@Param("name")String name, @Param("money")Double money);

    @Update("update tab_account set money = money - #{money} where name = #{name} ")
    void outMoney(@Param("name")String name, @Param("money")Double money);

    @Select("select * from tab_account")
    List<Account> findAllAccount();
}