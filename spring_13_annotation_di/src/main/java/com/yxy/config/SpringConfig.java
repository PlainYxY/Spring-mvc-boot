package com.yxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// 这个注解替换了 配置文件applicationContext.xml生成的壳子(就是那堆自动生成的)
// 定义配置类的注解
@Configuration
// 这个注解替换了 配置文件applicationContext.xml中的 扫描组件【<context:component-scan base-package="com.yxy"/>】
@ComponentScan("com.yxy")
// 还可以细分扫描的包(因为有些bean不能乱加载) 用数组方式写
// @ComponentScan({"com.yxy.service","com.yxy.dao"})

// @PropertySource("classpath:jdbc.properties")
// 或者这样缩写
@PropertySource("jdbc.properties")
public class SpringConfig {
}
