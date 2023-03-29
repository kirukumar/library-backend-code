package com.library.service;

import java.util.List;

import com.library.entity.BookDetails;



public interface libraryService {

	public String saveBookDetails(BookDetails bookdetails);
	public String updateBookDetails(BookDetails bookdetails);
	public List<BookDetails> getAllBookDetais();
	public boolean isIdExists(int id);
	public BookDetails findByBookName(String BookName);
}
