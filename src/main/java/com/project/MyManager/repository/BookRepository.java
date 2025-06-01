package com.project.MyManager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.MyManager.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(String author);
}
