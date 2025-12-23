package com.yxy.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.yxy.service"})
@PropertySource("classpath:jdbc.properties")
@Import({MybatisConfig.class, JdbcConfig.class})
// @EnableAspectJAutoProxy
@EnableTransactionManagement
public class SpringConfig {
}
