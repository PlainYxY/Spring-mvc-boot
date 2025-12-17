package com.yxy.controller;

import com.yxy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    // 新增方法 修改为 RESTful风格
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestBody User user){
        System.out.println("user save.." + user);
        return "{'model','user save'}:}";
    }

    // 新增方法
    // @RequestMapping("/save")
    // @ResponseBody
    // public String save(@RequestBody User user){
    //     System.out.println("user save.." + user);
    //     return "{'model','user save'}:}";
    // }

    // 删除方法 修改为 RESTful风格
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("user delete.." + id);
        return "{'model','user delete'}:}";
    }

    // 删除方法
    // @RequestMapping("/delete")
    // @ResponseBody
    // public String delete(Integer id){
    //     System.out.println("user delete.." + id);
    //     return "{'model','user delete'}:}";
    // }

    // 修改方法 修改为 RESTful风格
    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update.." + user);
        return "{'model','user update'}:}";
    }

    // 修改方法
    // @RequestMapping(value = "/update")
    // @ResponseBody
    // public String update(@RequestBody User user){
    //     System.out.println("user update.." + user);
    //     return "{'model','user update'}:}";
    // }

    // 查询一条数据方法 修改为 RESTful风格
    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("user getById.." + id);
        return "{'model','user getById'}:}";
    }

    // 查询一条数据方法
    // @RequestMapping("/getById")
    // @ResponseBody
    // public String getById(Integer id){
    //     System.out.println("user getById.." + id);
    //     return "{'model','user getById'}:}";
    // }

    // 查询全部数据方法 修改为 RESTful风格
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String getByAll(){
        System.out.println("user getByAll..");
        return "{'model','user getByAll'}:}";
    }

    // 查询全部数据方法
    // @RequestMapping("/getByAll")
    // @ResponseBody
    // public String getByAll(){
    //     System.out.println("user getByAll..");
    //     return "{'model','user getByAll'}:}";
    // }

}
