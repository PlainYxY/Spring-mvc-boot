package com.yxy.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.yxy")
// 这个注解可以把.properties文件获取到，然后在程序内直接同@Value(${})注解 获取文件内的数据
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}