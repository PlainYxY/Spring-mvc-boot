package com.yxy.controller;

import com.yxy.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// 这是简化修改后的BookController类

@RestController
@RequestMapping("books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save--->" + book);
        return "{'model','book save success'}:}";
    }

    @GetMapping
    public List<Book> getByAll(){

        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setType("小说");
        book1.setName("龙族");
        book1.setDescription("nb");

        Book book2 = new Book();
        book2.setType("小说");
        book2.setName("活着");
        book2.setDescription("nb too");

        bookList.add(book1);
        bookList.add(book2);

        System.out.println("book getByAll...");
        return bookList;
    }

}
