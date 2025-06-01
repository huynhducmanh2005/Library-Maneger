package com.project.MyManager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.MyManager.dto.request.BookRequest;
import com.project.MyManager.model.Book;

@Service
public interface BookService extends BaseService<Book, BookRequest, Long> {
    List<Book> getByAuthor(String author);
}