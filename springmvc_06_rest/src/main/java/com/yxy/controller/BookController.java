package com.yxy.controller;

import com.yxy.domain.Book;
import org.springframework.web.bind.annotation.*;

// @Controller
// @ResponseBody
// 上面两个合二为一了
@RestController
@RequestMapping("books")
public class BookController {

    // 新增方法（简化写法）
    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save.." + book);
        return "{'model','book save'}:}";
    }

    // 删除方法（简化写法）
    // @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("book delete.." + id);
        return "{'model','book delete'}:}";
    }

    // 修改方法（简化写法）
    // @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update.." + book);
        return "{'model','book update'}:}";
    }

    // 查询一条数据方法（简化写法）
    // @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("book getById.." + id);
        return "{'model','book getById'}:}";
    }

    // 查询全部数据方法 （简化写法）
    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getByAll(){
        System.out.println("book getByAll..");
        return "{'model','book getByAll'}:}";
    }

}
