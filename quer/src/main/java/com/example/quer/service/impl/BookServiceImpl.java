package com.example.quer.service.impl;

import com.example.quer.entity.Book;
import com.example.quer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Book> getBookList() {
        String sql = "select * from book where id = ?";
        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<Book>(Book.class);
        return this.jdbcTemplate.query(sql, rowMapper,5);
    }

    @Override
    public Book getBook() {
        String sql = "select * from book where id = ?";
        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<Book>(Book.class);
        return this.jdbcTemplate.queryForObject(sql, rowMapper,5);
    }
}
