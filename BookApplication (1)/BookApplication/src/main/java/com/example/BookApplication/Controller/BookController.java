package com.example.BookApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookApplication.Enums.Genre;
import com.example.BookApplication.Models.Book;
import com.example.BookApplication.Requests.CreateBookRequest;
import com.example.BookApplication.service.ServiceInterf;

@RestController

public class BookController {
	
	@Autowired
	ServiceInterf serviceInterf;
	@PostMapping("/create")
	Book createBook( @RequestBody CreateBookRequest createBookRequest)
	{
		return serviceInterf.saveBook(createBookRequest);
	}
	@GetMapping("/findBook")
	Book findBookById(@RequestParam int id)
	{
		return serviceInterf.getById(id);
	}
	
	@GetMapping("/findBookByEmail")
	Book findBookByEmail(@RequestParam String email)
	{
		return serviceInterf.findBookByEmail(email);
	}
	@GetMapping("/findBooksByName")
	List<Book> findBooksByName(@RequestParam String name)
	{
		return serviceInterf.findBooksByname(name);
	}
    @GetMapping("/findAll")
    List<Book> findAll()
    {
    	return serviceInterf.findAll();
    }
    @GetMapping("/findAllByGenre")
    List<Book> findAllBooksByGenre(@RequestParam String key)
    {
    	return serviceInterf.FilterBooksByGenre(Genre.valueOf(key));
    }
}
