package com.yxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// 可以加在 类注解充当整个模块的访问前缀
@RequestMapping("/user")
public class UserController {

    // 加在方法上充当具体的名称
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module','user save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete...");
        return "{'module','user delete'}";
    }
}
