package com.example.ibatis;

import com.example.ibatis.dao.bookDao;
import com.example.ibatis.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
 class BookTest {
    @Autowired
    private bookDao dao;
    @Test
     void getbook(){
        List<Book> b=dao.getBookList();
        b.stream().map(e->e.getName()).forEach(System.out::print);
    }
}
