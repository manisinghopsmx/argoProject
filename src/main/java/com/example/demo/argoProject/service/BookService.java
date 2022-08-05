package com.example.demo.argoProject.service;

import java.util.HashSet;

import com.example.demo.argoProject.modal.Book;

public interface BookService {
    HashSet<Book> findAllBook();
    Book findBookByID(long id);
    void addBook(Book b);
    void deleteAllData();
}