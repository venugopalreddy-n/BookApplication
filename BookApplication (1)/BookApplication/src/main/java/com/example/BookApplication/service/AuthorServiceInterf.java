package com.example.BookApplication.service;

import java.util.List;

import com.example.BookApplication.Models.Author;

public interface AuthorServiceInterf {
Author findByEmail(String email);
Author createAuthor(Author author);
Author findById(int id);
List<Author> findAll();
}
