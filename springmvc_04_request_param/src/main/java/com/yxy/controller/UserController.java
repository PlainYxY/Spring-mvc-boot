package com.yxy.controller;

import com.yxy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/commonParam")
    @ResponseBody
    // 1、普通参数
    // 请求URL：http://localhost/commonParam?name=yxy&age=20
    public String commonParam( String name, int age){
        System.out.println("参数传递====>"+ name +","+age);
        return "{'module','common param'}";
    }

    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    // 2、普通参数：请求参数名与形参名不同
    // 请求URL：http://localhost/commonParamDifferentName?name=yxy&age=18
    public String commonParamDifferentName(@RequestParam("name") String username, int age){
        System.out.println("参数传递====>"+ username +","+age);
        return "{'module','common different name param'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    // 3、POJO参数
    // 请求URL：http://localhost/pojoParam?name=yxy&age=20
    public String pojoParam(User user){
        System.out.println("pojo参数传递====>"+ user);
        return "{'module','pojo param'}";
    }

    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    // 4、嵌套POJO参数（里面有引用类型(对象)）
    // 请求URL：http://localhost/pojoContainPojoParam?name=yxy&age=18&address.city=beijing&address.province=BeiJing
    public String pojoContainPojoParam(User user){
        System.out.println("嵌套pojo参数传递====>"+ user);
        return "{'module','pojo contain pojo param'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    // 5、数组参数
    // 请求URL：http://localhost/arrayParam?likes=game&likes=music
    public String arrayParam(String[] likes){
        System.out.println("数组参数传递====>"+ Arrays.toString(likes));
        return "{'module','array param'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    // 6、集合参数（与数组不同的是需要额外在形参前写 @RequestParam注解）
    // 请求URL：http://localhost/listParam?likes=game&likes=music
    public String listParam(@RequestParam List<String> likes){
        System.out.println("集合参数传递====>"+ likes);
        return "{'module','list param'}";
    }
}
