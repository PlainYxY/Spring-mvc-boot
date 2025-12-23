package com.yxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.yxy.controller","com.yxy.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
