package com.yxy;

import com.yxy.config.SpringConfig;
import com.yxy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotationDI {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 上面的 读取Spring核心配置文件来初始化容器对象 替换为下面的 读取Java Config配置类来初始化容器对象
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        BookService bookService = context.getBean(BookService.class);
        bookService.save();
    }
}