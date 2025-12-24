package com.yxy.controller;

import com.yxy.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    // 用此种方法，读取yml文件中的属性
    // 方式一
    @Value("${lesson}")
    private String lesson;

    @Value("${server.port}")
    private Integer prot;

    @Value("${enterprise.subject[0]}")
    private String subject;

    // 方式二
    @Autowired
    private Environment environment;

    // 方式三
    @Autowired
    private Enterprise enterprise;


    @GetMapping("/{id}")
    public String book(@PathVariable String id){
        System.out.println("id=>" + id);
        System.out.println(lesson);
        System.out.println(prot);
        System.out.println(subject);
        System.out.println("--------------------");
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("enterprise.subject[1]"));
        System.out.println("--------------------");
        System.out.println(enterprise.getName());
        System.out.println(enterprise.getAge());
        System.out.println(enterprise.getSubject()[0]);
        return "book controller";
    }
}
