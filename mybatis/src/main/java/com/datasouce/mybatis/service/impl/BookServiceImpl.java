package com.datasouce.mybatis.service.impl;


import com.datasouce.mybatis.entity.Book;
import com.datasouce.mybatis.mapper.BookMapper;
import com.datasouce.mybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Macky
 * @Title class BookServiceImpl
 * @Description: TODO
 * @date 2019/7/12 20:47
 */
@Service
public class BookServiceImpl  implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public List<Book> getBookList(Integer count) {
        return bookMapper.getBookList(count);
    }

    @Override
    public boolean save(Book book) {
        return bookMapper.save(book);
    }


}
