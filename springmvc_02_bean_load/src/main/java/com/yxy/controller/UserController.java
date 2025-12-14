package com.yxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    // 2.2 设置当前操作的访问路径（用@ReuqsetMapping()注解）
    @RequestMapping("/save")
    // 2.3 设置当前操作的返回值类型（用@ResponseBody()注解）
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module','springmvc'}";
    }
}
