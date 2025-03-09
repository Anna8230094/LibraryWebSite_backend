package com.library.library_app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;
    @Column
    private String author;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column
    private int copies;
    @Column(name = "copies_available")
    private int copiesAvailable;
    @Column
    private String category;
    @Column(columnDefinition = "TEXT")
    private String img;

}
