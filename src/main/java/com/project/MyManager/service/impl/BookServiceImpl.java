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
            Book book = bookRepository.findById(id).orElseThrow(() -> new Exception("Book not found with id: " + id));
            bookRepository.deleteById(id);

        } catch (Exception e) {
            throw new RuntimeException("Error deleting book with id: " + id, e);
        }
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getById(long id) throws Exception {
        try {
            return bookRepository.findById(id);
        } catch (Exception e) {
            throw new Exception("Error retrieving book with id: " + id);
        }
    }

    @Override
    public Book creat(BookRequest bookRequest) throws Exception {
        try {
            Book book = new Book();
            book.setAuthor(bookRequest.getAuthor());
            book.setAvailableCopies(bookRequest.getAvailableCopies());
            book.setIsbn(bookRequest.getIsbn());
            book.setPrice(bookRequest.getPrice());
            book.setPublishYear(bookRequest.getPublishYear());
            book.setPublisher(bookRequest.getPublisher());
            book.setShelfLocation(bookRequest.getPublisher());
            book.setTitle(bookRequest.getTitle());
            book.setTotalCopies(bookRequest.getTotalCopies());

            return bookRepository.save(book);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Book update(long id, BookRequest bookRequest) throws Exception {
        try {
            Book book = bookRepository.findById(id).orElseThrow(() -> new Exception("Book not found with id: " + id));
            book.setAuthor(bookRequest.getAuthor());
            book.setAvailableCopies(bookRequest.getAvailableCopies());
            book.setIsbn(bookRequest.getIsbn());
            book.setPrice(bookRequest.getPrice());
            book.setPublishYear(bookRequest.getPublishYear());
            book.setPublisher(bookRequest.getPublisher());
            book.setShelfLocation(bookRequest.getPublisher());
            book.setTitle(bookRequest.getTitle());
            book.setTotalCopies(bookRequest.getTotalCopies());

            return bookRepository.save(book);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Book> getByAuthor(String author) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByAuthor'");
    }

}
