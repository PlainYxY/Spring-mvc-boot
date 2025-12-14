package com.yxy.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/// 这个写法是最下面注释掉的哪个写法的简化
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}


// public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
//     // 加载springMVC容器配置
//     protected WebApplicationContext createServletApplicationContext() {
//         AnnotationConfigWebApplicationContext acwac = new AnnotationConfigWebApplicationContext();
//         acwac.register(SpringMvcConfig.class);
//         return acwac;
//     }
//
//     // 加载spring容器配置
//     protected WebApplicationContext createRootApplicationContext() {
//         AnnotationConfigWebApplicationContext acwac = new AnnotationConfigWebApplicationContext();
//         acwac.register(SpringConfig.class);
//         return acwac;
//     }
//
//     // 设置哪些请求归属springMVC处理
//     protected String[] getServletMappings() {
//         return new String[]{"/"};
//     }
//
// }
