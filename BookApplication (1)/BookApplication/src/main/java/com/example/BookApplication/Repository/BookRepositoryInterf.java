package com.example.BookApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookApplication.Enums.Genre;
import com.example.BookApplication.Models.Book;

@Repository
public interface BookRepositoryInterf extends JpaRepository<Book,Integer> {

	Book findBookByEmail(String name);
	List<Book> findAllByName(String name);
	List<Book> findAllByGenre(Genre genre);
}
