package com.example.BookApplication.service;


import java.util.List;

import com.example.BookApplication.Enums.Genre;
import com.example.BookApplication.Models.Book;
import com.example.BookApplication.Requests.CreateBookRequest;


public interface ServiceInterf {
	Book saveBook(CreateBookRequest b1);
	Book getById(int id);
	Book findBookByEmail(String email);
	List<Book> findBooksByname(String name);
    List<Book> findAll();
    List<Book> FilterBooksByGenre(Genre genre);
}
