package com.yxy;

import com.yxy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 方式一创建容器、加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 方式二创建容器、从文件系统下加载配置文件
        // ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\workspace\\spring\\spring_10_container\\src\\main\\resources\\applicationContext.xml");

        // 方式一 按照名称 获取bean
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // 方式二 按照名称+类型 获取bean (可以不同强转)
        // BookDao bookDao = ctx.getBean("bookDao",BookDao.class);
        // 方式三 按照类型 获取bean (可以省略名称)
        // BookDao bookDao = ctx.getBean(BookDao.class);

        // bookDao.save();
    }
}
