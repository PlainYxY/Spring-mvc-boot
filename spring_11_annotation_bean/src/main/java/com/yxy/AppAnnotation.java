package com.yxy;

import com.yxy.dao.BookDao;
import com.yxy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml.bak");

        BookDao bookDao = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);

        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService);
    }
}