package com.example.BookApplication.Models;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {

	private String name;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	int age;
	private String email;
	private String contact;
	@OneToMany(mappedBy="author")
	@JsonIgnoreProperties({"author"})
	private List<Book> bookList;
	@CreationTimestamp
	private Date createdOn;
	@UpdateTimestamp
	private Date updateOn;
	
}
