package com.yxy.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

// 4 定义一个servlet容器启动的配置类，在里面加载springmvc的核心配置
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    // 加载springMVC容器配置
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext acwac = new AnnotationConfigWebApplicationContext();
        acwac.register(SpringMvcConfig.class);
        return acwac;
    }
    // 设置哪些请求归属springMVC处理
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    // 加载spring容器配置
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
