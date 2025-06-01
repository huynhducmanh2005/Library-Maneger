package com.project.MyManager.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.MyManager.dto.request.BookRequest;
import com.project.MyManager.model.Book;
import com.project.MyManager.repository.BookRepository;
import com.project.MyManager.service.BookService;

public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void delete(long id) throws Exception {
        try {
            bookRepository.deleteById(id);

        } catch (Exception e) {
            throw new RuntimeException("Error deleting book with id: " + id, e);
        }
    }

    @Override
    public List<Book> getAll() {
        try {
            List<Book> listBooks = bookRepository.findAll();
            return listBooks;
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving all books", e);
        }
    }

    @Override
    public Optional<Book> getById(long id) throws Exception {
        try {
            return bookRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving book with id: " + id, e);
        }
    }

    @Override
    public Book creat(BookRequest entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creat'");
    }

    @Override
    public Book update(long id, BookRequest entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public List<Book> getByAuthor(String author) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByAuthor'");
    }

}
