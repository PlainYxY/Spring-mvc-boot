package com.yxy;

import com.yxy.dao.BookDao;
import com.yxy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // BookDao bookDao = (BookDao) ctx.getBean("bookDao1");
        // bookDao.save();


        BookService bookService = (BookService) ac.getBean("service");
        bookService.save();
    }
}
