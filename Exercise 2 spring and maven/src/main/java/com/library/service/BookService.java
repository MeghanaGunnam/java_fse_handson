package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService Bean Created");
    }

    public void addBook() {
        System.out.println("BookService is calling Repository...");
        bookRepository.saveBook();
    }
}