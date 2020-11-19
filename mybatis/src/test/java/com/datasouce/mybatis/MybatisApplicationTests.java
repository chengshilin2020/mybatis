package com.datasouce.mybatis;

import com.datasouce.mybatis.entity.Book;
import com.datasouce.mybatis.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    BookService bookService;
    @Test
    void contextLoads() {
        List<Book> ds= bookService.getBookList(4);
        ds.forEach(System.out::print);
    }

}
