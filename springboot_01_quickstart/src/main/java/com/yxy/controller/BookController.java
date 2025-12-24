package com.yxy.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public String getById(@PathVariable String id) {
        System.out.println("id =>" + id);
        return "hello, springboot";
    }
}
