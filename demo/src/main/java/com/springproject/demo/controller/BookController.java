package com.springproject.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springproject.demo.repositories.BookRepositries;

@Controller
public class BookController {
    
    private final BookRepositries bookrepositries;
    
    
    
    
    public BookController(BookRepositries bookrepositries) {
	this.bookrepositries = bookrepositries;
    }




    @RequestMapping("/books")
    public String getBooks(Model model) {
	
	model.addAttribute("books", bookrepositries.findAll());
	
	
	return "books/list";
	
    }

}
