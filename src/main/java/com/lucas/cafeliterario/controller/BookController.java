package com.lucas.cafeliterario.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.cafeliterario.model.Book;
import com.lucas.cafeliterario.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
    
    private BookService service;

    public BookController(BookService service){
        this.service = service;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Book>> findAll(){
        List<Book> books = this.service.getBooksFromLibrary();
        return ResponseEntity.ok().body(books);
    }

}
