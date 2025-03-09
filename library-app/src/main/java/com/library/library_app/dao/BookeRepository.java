package com.library.library_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.library_app.entity.Book;

@Repository
public interface BookeRepository extends JpaRepository<Book, Long> {
    
}
