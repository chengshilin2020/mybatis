package com.datasouce.jpa;

import com.datasouce.jpa.entity.Book;
import com.datasouce.jpa.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
 class JpaApplicationTests {
    @Autowired
    BookMapper bookMapper;
    @Test
     void contextLoads() {
        List<Book> ds= bookMapper.getBookList(4);
        ds.forEach(System.out::print);
    }
}
