package com.datasour.plus.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.datasour.plus.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Macky
 * @Title interface BookService
 * @Description: TODO
 * @date 2019/7/12 20:47
 */
@Service
public interface BookService extends IService<Book> {

    /**
     * 保存书籍信息
     *
     * @param book
     * @return
     */
    @Override
    boolean save(Book book);

    /**
     * 查询全部书籍信息
     *
     * @return
     */
    List<Book> getBookList(Integer count);
}
