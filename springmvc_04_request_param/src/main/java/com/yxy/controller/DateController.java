package com.yxy.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Date;


@Controller
public class DateController {

    @RequestMapping("/dateParam")
    @ResponseBody
    // 日期型参数传递
    // 请求URL：http://localhost/dateParam

    // 接收参数时，根据不同的日期格式，设置不同的接收方式（如下）
    public String dateParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-mm-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy/mm/dd hh:mm:ss") Date date2) {
        System.out.println("参数传递 date====>"+ date);
        System.out.println("参数传递 date1(yyyy-mm-dd)====>"+ date1);
        System.out.println("参数传递 date2(yyyy/mm/dd hh:mm:ss)====>"+ date2);
        return "{'module','date param'}";
    }
}
