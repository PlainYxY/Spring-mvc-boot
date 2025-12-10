package com.yxy.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    //<typeAliases>
    //     <package name="com.yxy.domain"/>
    //   </typeAliases>
    //     <transactionManager type="JDBC"></transactionManager>
    //        <dataSource type="POOLED">
    //           <property name="driver" value="${jdbc.driver}"></property>
    //           <property name="url" value="${jdbc.url}"></property>
    //           <property name="username" value="${jdbc.username}"></property>
    //           <property name="password" value="${jdbc.password}"></property>
    //        </dataSource>

    // 这个bean代替的上面配置文件里的这部分
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.yxy.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }


    // <mappers>
    //     <package name="com.yxy.com.yxy.dao"></package>
    // </mappers>

    // 这个bean代替的上面配置文件里的这部分
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.yxy.dao");
        return msc;
    }
}