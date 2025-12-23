package com.yxy.dao;

import com.yxy.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    // 想简写前面的类型，就需要把后面的参数都一一列出来（比如在数据里里会自增的id）
    // @Insert("insert into tab_book values (null,#{type},#{name},#{description})")
    @Insert("insert into tab_book (type,name,description) values (#{type},#{name},#{description})")
    void save(Book book);

    @Delete("delete from tab_book where id = #{id}")
    void delete(Integer id);

    @Update("update tab_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    void update(Book book);

    @Select("select * from tab_book where id = #{id}")
    Book getById(Integer id);

    @Select("select * from tab_book")
    List<Book> getAll();

}
