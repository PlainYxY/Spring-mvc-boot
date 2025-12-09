package com.yxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.yxy.dao")

// 方式一、扫描式（不推荐）、给JdbcConfig类写上@Configuration注解，然后用@ComponentScan("com.yxy.config")注解 在加载的时候一起扫描
// @ComponentScan("com.yxy.config")
// 方式二、导入式 使用Import注解 （多个配置类就用数组形式 逗号隔开）
@Import(JdbcConfig.class)
public class SpringConfig {
}
