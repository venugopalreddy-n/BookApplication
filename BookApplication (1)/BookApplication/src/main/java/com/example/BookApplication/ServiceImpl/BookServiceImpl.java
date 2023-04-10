package com.example.BookApplication.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookApplication.Enums.Genre;
import com.example.BookApplication.Models.Author;
import com.example.BookApplication.Models.Book;
import com.example.BookApplication.Repository.BookRepositoryInterf;
import com.example.BookApplication.Requests.CreateBookRequest;
import com.example.BookApplication.service.AuthorServiceInterf;
import com.example.BookApplication.service.ServiceInterf;

@Service
public class BookServiceImpl implements ServiceInterf{

	@Autowired
	BookRepositoryInterf bookRepositoryInterf;
    @Autowired
    AuthorServiceInterf authorServiceInterf;
	@Override
	public Book saveBook(CreateBookRequest b1) {
		// TODO Auto-generated method stub
		Book book=b1.to();
		Author author= book.getAuthor();
		Author authorDb= authorServiceInterf.findByEmail(author.getEmail());
		if(authorDb==null)
			authorDb=authorServiceInterf.createAuthor(author);
		book.setAuthor(authorDb);
		return bookRepositoryInterf.save(book);
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		return bookRepositoryInterf.findById(id).orElseThrow();
	}

	@Override
	public Book findBookByEmail(String email) {
		return bookRepositoryInterf.findBookByEmail(email);
	}

	@Override
	public List<Book> findBooksByname(String name) {
        
		return bookRepositoryInterf.findAllByName(name);
	}

	@Override
	public List<Book> findAll() {
		return bookRepositoryInterf.findAll();
	}

	@Override
	public List<Book> FilterBooksByGenre(Genre genre) {
		
		return bookRepositoryInterf.findAllByGenre(genre);
	}
	
	
	 
	}
	


