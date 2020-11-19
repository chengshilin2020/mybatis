package com.datasour.plus.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datasour.plus.entity.Book;
import com.datasour.plus.mapper.BookMapper;
import com.datasour.plus.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Macky
 * @Title class BookServiceImpl
 * @Description: TODO
 * @date 2019/7/12 20:47
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Override
    public List<Book> getBookList(Integer count) {
        return baseMapper.selectList(Wrappers.<Book>lambdaQuery().eq(Book::getCount,count));
    }

    @Override
    public boolean save(Book book) {
        return super.save(book);
    }


}
