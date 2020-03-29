package com.spring.elastic.controllers;

import com.spring.elastic.Domain.Books;
import com.spring.elastic.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class bookController  {
    @Autowired
    private BookService bookService;

    @GetMapping("/getAll")
    public List<Books> getAllBooks(){
        return bookService.getAllBooks();
    }

}
