package com.yxy.dao;

import com.yxy.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加@Mapper 让springboot可以扫描到这个组件 生成它的自动代理
@Mapper
public interface BookDao {

    // 想简写前面的类型，就需要把后面的参数都一一列出来（比如在数据里里会自增的id）
    // @Insert("insert into tab_book values (null,#{type},#{name},#{description})")
    @Insert("insert into tab_book (type,name,description) values (#{type},#{name},#{description})")
    int save(Book book);

    @Delete("delete from tab_book where id = #{id}")
    int delete(Integer id);

    @Update("update tab_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    int update(Book book);

    @Select("select * from tab_book where id = #{id}")
    Book getById(Integer id);

    @Select("select * from tab_book")
    List<Book> getAll();

}
