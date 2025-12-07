package com.yxy;

import com.yxy.dao.BookDao;
import com.yxy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAutoWire {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) ctx.getBean("dao");

        BookService bookService = (BookService) ctx.getBean(BookService.class);
        bookService.save();
    }
}
