package com.yxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.yxy")
// 告诉程序是使用注解形式开发的 EnableAspectJAutoProxy 释义为（启用AspectJ自动代理）
@EnableAspectJAutoProxy
public class SpringConfig {
}
