package com.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bookdetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Id")
	private int id;
	@Column(name ="BookName")
	private String bookName;
	@Column(name ="BookType")
	private String bookType;
	@Column(name ="BookDesc")
	private String bookDesc;
	@Column(name ="BookPrice")
	private int bookPrice;
}
