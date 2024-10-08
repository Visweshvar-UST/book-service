package com.demo.book_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.book_service.entity.Book;
import com.demo.book_service.repo.BookRepo;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookRepo bookRepo;
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }
    @GetMapping("/books/{id}")
    public Book getABooks(@PathVariable Long id){
        return bookRepo.findById(id).get();
    }
    @PostMapping("/books")
    public Book addBooks(@RequestBody Book book){
        return bookRepo.saveAndFlush(book);
    }
}
