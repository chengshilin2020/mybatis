package com.datasouce.mybatis.mapper;


import com.datasouce.mybatis.entity.Book;

import java.util.List;

/**
 * @author Macky
 * @Title class BookMapper
 * @Description: TODO
 * @date 2019/7/12 20:46
 */
public interface BookMapper {
    /**
     * 保存书籍信息
     *
     * @param book
     * @return
     */
    boolean save(Book book);

    /**
     * 查询全部书籍信息
     *
     * @return
     */
    List<Book> getBookList(Integer count);
}
