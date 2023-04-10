package com.example.BookApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookApplication.Models.Author;
@Repository
public interface AuthorRepositoryInterf extends JpaRepository<Author,Integer>{
	Author findByEmail(String email);

}
