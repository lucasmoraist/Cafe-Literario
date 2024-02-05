package com.lucas.cafeliterario.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lucas.cafeliterario.model.Book;

@FeignClient(name = "book-api", url = "https://api-spring-book.s3.amazonaws.com/")
public interface BookClient {
    
    @GetMapping("/book.json")
    List<Book> getBooks();

}
