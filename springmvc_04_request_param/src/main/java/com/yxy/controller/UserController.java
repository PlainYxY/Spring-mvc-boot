package com.yxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// 可以加在 类注解充当整个模块的访问前缀
public class UserController {

    // 加在方法上充当具体的名称
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("参数传递====>"+name +","+age);
        return "{'module','common param'}";
    }
}
