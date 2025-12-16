package com.yxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// 创建springmvc的配置类，加载controller对应的bean
@Configuration
// 这里只加载自己对应的controller的bean
@ComponentScan("com.yxy.controller")
// 开启由json数据转换对象的功能
@EnableWebMvc
public class SpringMvcConfig {
}
