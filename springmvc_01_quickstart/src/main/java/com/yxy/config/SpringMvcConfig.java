package com.yxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 3 创建springmvc的配置类，加载controller对应的bean
@Configuration
// 这里只加载自己对应的controller的bean
@ComponentScan("com.yxy.controller")
public class SpringMvcConfig {
}
