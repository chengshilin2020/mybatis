package com.example.quer;

import com.example.quer.entity.Book;
import com.example.quer.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class QuerApplicationTests {

    @Autowired
    BookService bookService;
    @Test
    void contextLoads() {
        List<Book> d= bookService.getBookList();
        d.forEach(e-> System.out.println(e.getName()));
    }
    @Test
    void book() {
        Book d= bookService.getBook();
        System.out.println(d.getName());
    }
}
