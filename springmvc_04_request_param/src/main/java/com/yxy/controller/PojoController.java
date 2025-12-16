package com.yxy.controller;

import com.yxy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class PojoController {

    // Json格式数据传递三种参数
    // 1 集合、2 pojo（java普通对象）、3 list post（里面是pojo的list集合）

    @RequestMapping("/listParamForJson")
    @ResponseBody
    // 1、集合参数:json格式
    // （处理Json数据传递的参数需要在形参前加 @RequestBody注解）
    // 请求URL：http://localhost/listParamForJson（请求的集合数据：["a1","b2","c3"]）
    public String listParamForJson (@RequestBody List<String> likes){
        System.out.println("集合参数json格式传递====>"+ likes);
        return "{'module','list common for json param'}";
    }

    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    // 2、pojo参数:json格式
    // （与数组同的是需要额外在形参前写 @RequestParam注解）
    // 请求URL：http://localhost/pojoParamForJson
    // （请求的pojo数据：
    // {
    //     "name":"yxy",
    //     "age":18,
    //     "address":{
    //         "province":"BeiJing",
    //         "city":"beijing"
    //     }
    // }）
    public String pojoParamForJson (@RequestBody User user){
        System.out.println("pojo参数json格式传递====>"+ user);
        return "{'module','pojo common for json param'}";
    }

    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    // 3、list pojo参数:json格式
    // （与数组同的是需要额外在形参前写 @RequestParam注解）
    // 请求URL：http://localhost/listPojoParamForJson
    // （请求的list pojo数据：
    // [
    //     {"name":"yxy","age":18},
    //     {"name":"yxy2","age":20}
    // ]）
    public String listPojoParamForJson (@RequestBody List<User> list){
        System.out.println("list pojo参数json格式传递====>"+ list);
        return "{'module','list pojo common for json param'}";
    }
}
