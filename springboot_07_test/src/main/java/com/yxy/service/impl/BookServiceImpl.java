package com.yxy.service.impl;

import com.yxy.service.BookService;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BookServiceImpl implements BookService {

    public void addBook() {
        System.out.println("book service add book");
    }

}
