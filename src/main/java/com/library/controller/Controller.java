package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.BookDetails;
import com.library.service.libraryServiceImpl;

@RestController
@RequestMapping("library")
public class Controller {
	
	@Autowired
	libraryServiceImpl libraryServiceImpl;

	//method to perform posting
@PostMapping("book/save")
public String POST(@RequestBody BookDetails bookdetails) {
	
	return libraryServiceImpl.saveBookDetails(bookdetails);
	
}

@PutMapping("book/update")
public String UPDATE(@RequestBody BookDetails bookdetails) {
	
	return libraryServiceImpl.updateBookDetails(bookdetails);
	
}

@GetMapping("book/all")
public List<BookDetails> GET() {
  return libraryServiceImpl.getAllBookDetais();
	
	
	
	
}



}
