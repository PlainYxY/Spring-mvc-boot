package com.yxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration

// Spring加载的bean设定扫描范围为 com.yxy,排除掉controller包内的bean
// @ComponentScan({"com.yxy.service","com.yxy.dao"})

// Spring加载的bean设定扫描范围为惊喜范围，例如service包、dao包等
@ComponentScan(value = "com.yxy",
    excludeFilters = @ComponentScan.Filter(
            type = FilterType.ANNOTATION,
            classes = Controller.class
    )
)
public class SpringConfig {
}
