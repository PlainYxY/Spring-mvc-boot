package com.yxy;

import com.yxy.dao.BookDao;
import com.yxy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao1 = (BookDao) ctx.getBean("dao");
        System.out.println(bookDao1);
        BookDao bookDao2 = (BookDao) ctx.getBean("dao");
        System.out.println(bookDao2);

        // BookService bookService = (BookService) ctx.getBean("service");
        // bookService.save();
    }
}
