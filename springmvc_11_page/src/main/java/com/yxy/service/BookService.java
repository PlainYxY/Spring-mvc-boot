package com.yxy.service;

import com.yxy.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据id查单个
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查全部
     * @return
     */
    public List<Book> getAll();
}
