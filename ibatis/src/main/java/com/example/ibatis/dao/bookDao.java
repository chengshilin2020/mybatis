package com.example.ibatis.dao;

import com.example.ibatis.entity.Book;

import java.util.List;

public interface bookDao {
    List<Book> getBookList();
}
