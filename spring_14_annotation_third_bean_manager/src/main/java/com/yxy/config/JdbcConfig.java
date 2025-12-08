package com.yxy.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.yxy.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


// @Configuration
public class JdbcConfig {

    // |简单类型注入，直接这样写就行
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/test")
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;

    // 1.定义一个方法获取要管理的对象
    // 2.添加@Bean表示当前方法的返回值是bean
    // 一般不写名称，类型也够用
    // @Bean("dataSource")
    @Bean
    public DataSource dataSource(BookDao bookDao) {
        // ||引用类型注入，在这个方法的形参写上容器中有的bean，spring会自动装配 （就像上一行的(BookDao bookDao)一样）
        System.out.println(bookDao);
        //
        DruidDataSource ds = new DruidDataSource();
        // 属性设置
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
