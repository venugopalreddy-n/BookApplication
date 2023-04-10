package com.example.BookApplication.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookApplication.Models.Author;
import com.example.BookApplication.Repository.AuthorRepositoryInterf;
import com.example.BookApplication.service.AuthorServiceInterf;

@Service
public class AuthorServiceImpl implements AuthorServiceInterf {

	@Autowired
	AuthorRepositoryInterf authorRepositoryInterf;
	@Override
	public Author findByEmail(String email) {
		return authorRepositoryInterf.findByEmail(email);
	}

	@Override
	public Author createAuthor(Author author) {
	
		return authorRepositoryInterf.save(author);
	}

	@Override
	public Author findById(int id) {

		return authorRepositoryInterf.findById(id).orElseThrow();
	}

	@Override
	public List<Author> findAll() {
		return authorRepositoryInterf.findAll();
	}
    
	

}
