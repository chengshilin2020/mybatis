package com.example.quer.service;

import com.example.quer.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBookList();
    public Book getBook();
}
