package com.example.BookApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookApplication.Models.Author;
import com.example.BookApplication.service.AuthorServiceInterf;

@RestController
public class AuthorController {

	@Autowired
	AuthorServiceInterf authorServiceInterf;
	@GetMapping("/findAuthor")
	public Author findById(int id)
	{
		return authorServiceInterf.findById(id);
	}
	@GetMapping("/findAllAuthors")
	public List<Author> findAll()
	{
		return authorServiceInterf.findAll();
	}
}
