package com.datasouce.jpa.mapper;



import com.datasouce.jpa.entity.Book;
import com.sun.xml.bind.api.impl.NameConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 参数值
 * @author wm
 * @version 1.0.0
 */
public interface BookMapper extends JpaRepository<Book, Integer> {

    @Query(nativeQuery = true, value = "select * from BOOK where 1=1 and count = ?1")
    public List<Book> getBookList(Integer count);
}
