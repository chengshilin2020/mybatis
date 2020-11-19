package com.datasouce.mybatis.service;



import com.datasouce.mybatis.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Macky
 * @Title interface BookService
 * @Description: TODO
 * @date 2019/7/12 20:47
 */

public interface BookService {

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
