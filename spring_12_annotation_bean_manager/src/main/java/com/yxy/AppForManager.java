package com.yxy;

import com.yxy.config.SpringConfig;
import com.yxy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForManager {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 上面的 读取Spring核心配置文件来初始化容器对象 替换为下面的 读取Java Config配置类来初始化容器对象
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
        // 暴力关闭
        context.close();
        // 使用关闭钩子关闭
        context.registerShutdownHook();
    }
}