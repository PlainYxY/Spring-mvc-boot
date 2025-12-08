package com.yxy;

import com.yxy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppContainer {
    public static void main(String[] args) {
        /// 容器初始化三种方式
        // 1.从类路径下加载配置文件 (常用)
        ApplicationContext classContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2.从系统文件下加载配置文件 (该文件的绝对路径)
        // FileSystemXmlApplicationContext fileContext = new FileSystemXmlApplicationContext("D:\\IDEA2025.2.2\\Study\\spring_10_container\\src\\main\\resources\\applicationContext.xml");


        // 这种强转太丑了,换个写法
        // BookDao bookDao = (BookDao) classContext.getBean("bookDao1");

        // 换成这样 后面的.class标注出他获取的bean的类型
        // BookDao bookDao = classContext.getBean("bookDao1", BookDao.class);

        // 或者直接只写.class 按类型找 (这种写法需要容器中对应的bean唯一)
        BookDao bookDao = classContext.getBean(BookDao.class);
        bookDao.save();


        // BookDao bookDao1 = (BookDao) fileContext.getBean("bookDao1");
        // bookDao1.save();
    }
}