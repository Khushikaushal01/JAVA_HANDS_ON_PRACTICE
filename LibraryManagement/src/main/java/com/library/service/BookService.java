package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
    }

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageBooks() {
        System.out.println("BookService managing books...");
        if (bookRepository != null) {
            bookRepository.executeRepositoryMethod();
        } else {
            System.out.println("Error: BookRepository is not injected!");
        }
    }
}
