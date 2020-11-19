package com.fishpro.jjpa;

import com.fishpro.jjpa.dao.BookRepository;
import com.fishpro.jjpa.entity.Book;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class JjpaApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    void before(){
        Book book=new Book();
        book.setId(9);
        book.setName("小冬");
        book.setCount(9);
        bookRepository.save(book);
    }

    @Test
    void contextLoads() {
//        Optional<Book> optionalUserDO= bookRepository.findById(1);
//        if(optionalUserDO.isPresent()){
//            Book userDO=optionalUserDO.get();
//            System.out.println("testFind user"+userDO.getName());
//        }

        List<Book> list=bookRepository.findAll();
        list.forEach(System.out::print);
    }
    @Test
    void after(){
        bookRepository.deleteById(9);
    }
}
