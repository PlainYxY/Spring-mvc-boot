package com.yxy;

import com.yxy.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

@SpringBootTest
class Application07Tests {

    @Autowired
    BookService bookService;

    @Test
    public void addBook() {
        bookService.addBook();
    }

}
