package com.yxy.controller;

import com.yxy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    @RequestMapping("/toText")
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }

    @RequestMapping("/toJsonPOJO")
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("yxy");
        user.setAge(18);
        return user;
    }

}
