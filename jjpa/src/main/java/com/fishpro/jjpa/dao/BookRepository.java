package com.fishpro.jjpa.dao;

import com.fishpro.jjpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
