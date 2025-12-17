package com.yxy.controller;

import com.yxy.domain.Book;
import org.springframework.web.bind.annotation.*;

// 这是简化修改后的BookController类

@RestController
// @RequestMapping("books")
public class BookController2 {

    // 新增方法（简化写法）
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save.." + book);
        return "{'model','book save'}:}";
    }

    // 删除方法（简化写法）
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("book delete.." + id);
        return "{'model','book delete'}:}";
    }

    // 修改方法（简化写法）
    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update.." + book);
        return "{'model','book update'}:}";
    }

    // 查询一条数据方法（简化写法）
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("book getById.." + id);
        return "{'model','book getById'}:}";
    }

    // 查询全部数据方法 （简化写法）
    @GetMapping
    public String getByAll(){
        System.out.println("book getByAll..");
        return "{'model','book getByAll'}:}";
    }

}
