package com.yxy;

import com.yxy.dao.BookDao;
import com.yxy.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Application08Tests {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        Book book = bookDao.findById(1);
        System.out.println(book);
    }

}
