package com.yxy;

import com.yxy.mapper.UserMapper;
import com.yxy.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// mybatis 代理开发
public class MybatisDemo2 {
    public static void main(String[] args) throws IOException {

        // 1、加载mybatis核心配置文件，获取SqlSessionFactory    以下三行是直接从mybatis官方文件导入的
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2、获取SqlSession 对象，用他来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3、执行sql语句（这里面写的是 映射文件里的 namespace.id（名称））
        // List<User> users = sqlSession.selectList("test.selectAll");

        // 3.1、获取 UserMapper接口的对象代理（与上面直接获取映射文件的方法id相比 更解耦）
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();

        System.out.println(users);

        // 4、释放资源
        sqlSession.close();
    }
}
