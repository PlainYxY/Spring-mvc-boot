package com.yxy.dao;

import com.yxy.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface BookDao {

    @Select("select * from tab_book where id = #{id}")
    Book findById(Integer id);
}
