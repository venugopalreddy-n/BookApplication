package com.example.BookApplication.Models;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.BookApplication.Enums.Genre;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {

   	private String name;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int cost;
	@ManyToOne
	@JsonIgnoreProperties({"bookList"})
	private Author author;
	
	@Column(unique=true,nullable=false)
	private String email;
	@Enumerated(value=EnumType.STRING)
	private Genre genre;
	@CreationTimestamp
	private Date CreatedOn;
	@UpdateTimestamp
	private Date UpdatedOn;
	
	
}
