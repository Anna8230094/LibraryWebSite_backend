package com.library_app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library_app.entity.Book;

@Repository
public interface BookRepositiry extends JpaRepository<Book, Long> {

}
