package com.example.BookApplication.Requests;

import com.example.BookApplication.Enums.Genre;
import com.example.BookApplication.Models.Author;
import com.example.BookApplication.Models.Book;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateBookRequest {

	private String name;
	
	private Author author;
	private String email;
	private Genre genre;
	private int cost;
	
	public Book to()
	{
		return Book.builder()
				 .name(name)
				 .author(author)
				 .email(email)
				 .genre(genre)
				 .cost(cost)
				 .build();
	}

	
}
