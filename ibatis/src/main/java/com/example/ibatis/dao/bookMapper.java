package com.example.ibatis.dao;

import com.example.ibatis.entity.Book;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface bookMapper {
    @Select("SELECT id, name, count FROM book")
    @Results(value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "count", property = "count")
    })
    List<Book> getBookList();
}
