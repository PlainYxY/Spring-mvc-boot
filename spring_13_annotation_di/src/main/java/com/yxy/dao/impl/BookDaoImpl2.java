package com.yxy.dao.impl;

import com.yxy.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {

    // 直接写入
    // @Value("YxY")
    // 外部文件 注入属性
    @Value("${name}")
    private String name;

    public void save() {
        System.out.println("book dao save2" + name);
    }
}
