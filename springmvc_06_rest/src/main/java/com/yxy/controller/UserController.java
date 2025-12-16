package com.yxy.controller;

import com.yxy.domain.Address;
import com.yxy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    // 响应页面/页面跳转
    @RequestMapping("/save")
    public String save(User user){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    // 响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }

    // 响应POJO对象（对象转json）
    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");
        User user = new User();
        Address address = new Address();
        address.setProvince("Beijing");
        address.setCity("beijing");

        user.setName("yxy");
        user.setAge(18);
        user.setAddress(address);
        return user;
    }

    // 响应POJO集合对象（对象集合转json数据）
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回json集合数据");
        User user1 = new User();
        user1.setName("yxy1");
        user1.setAge(18);

        User user2 = new User();
        user2.setName("yxy2");
        user2.setAge(20);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }

}
