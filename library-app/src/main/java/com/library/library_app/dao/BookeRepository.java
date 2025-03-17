package com.library.library_app.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.library_app.entity.Book;

@Repository
public interface BookeRepository extends JpaRepository<Book, Long> {
    
    Page<Book> findByTitleContaining(@RequestParam("title") String title, Pageable pageable);
}
