package com.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.BookDetails;
import com.library.repository.BookDetailsRepository;

@Service
public class libraryServiceImpl implements libraryService  {
	
	@Autowired
	BookDetailsRepository bookDetailsRepository;

	@Override
	public String saveBookDetails(BookDetails bookdetails) {
		// TODO Auto-generated method stub
		   String bookName=bookdetails.getBookName();
		   BookDetails bookdetailer =  findByBookName(bookName);
		   if(bookdetailer == null) {
		       bookDetailsRepository.save(bookdetails);
		        	return "Saving Successfully";
		    }
		   else {
			   return "Saving Unsuccessfull, book details is null";
		   }
		   
		   
		   
		
		 
		
		
		
		
		
	}

	@Override
	public String updateBookDetails(BookDetails bookdetails) {
		// TODO Auto-generated method stub
		 String bookName=bookdetails.getBookName();
		 BookDetails bookdetailer =  findByBookName(bookName);
		 
		 if(bookdetailer != null) {
			 bookdetails.setId(bookdetailer.getId());
		bookDetailsRepository.save(bookdetails);
		return "Updated Successfull";
		 }
		 else {
			 return "Updated Unsuccessfull";
		 }
	}

	@Override
	public List<BookDetails> getAllBookDetais() {
		// TODO Auto-generated method stub
		return bookDetailsRepository.findAll();
	}

	@Override
	public boolean isIdExists(int id) {
		// TODO Auto-generated method stub
		 Optional<BookDetails> bookdetails  =bookDetailsRepository.findById(id);
		 return bookdetails.isPresent();
	}

	@Override
	public BookDetails findByBookName(String BookName) {
		// TODO Auto-generated method stub
	      return bookDetailsRepository.findByBookName(BookName);
	}

	
}
