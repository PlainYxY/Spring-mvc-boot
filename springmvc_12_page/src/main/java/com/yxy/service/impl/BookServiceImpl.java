package com.yxy.service.impl;

import com.yxy.controller.Code;
import com.yxy.dao.BookDao;
import com.yxy.domain.Book;
import com.yxy.exception.BusinessException;
import com.yxy.exception.SystemException;
import com.yxy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    public Book getById(Integer id) {

        // 模拟一个业务异常
        if (id < 1){
            throw new BusinessException(Code.BUSINESS_ERR,"请勿进行非法操作（这是一个业务异常）");
        }

        // 模拟一个系统异常
        // 将可能出现的异常包装，转换为自定义异常
        try{
            int i = 1/0;
        }catch (Exception e){
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时...",e);
        }


        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
