package com.yxy;

import com.yxy.config.SpringConfig;
import com.yxy.service.ResourcesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHandlePW {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService bean = ac.getBean(ResourcesService.class);
        boolean b = bean.openURL("https://www.baidu.com", " root ");
        System.out.println(b);
    }
}
