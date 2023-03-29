package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entity.BookDetails;

public interface BookDetailsRepository extends JpaRepository<BookDetails,Integer>{

	public BookDetails findByBookName(String BookName);
}
