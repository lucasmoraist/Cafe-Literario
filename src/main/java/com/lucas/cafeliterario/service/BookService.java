package com.lucas.cafeliterario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lucas.cafeliterario.feign.BookClient;
import com.lucas.cafeliterario.model.Book;

@Service
public class BookService {
    
    // Criar construtor é uma alternativa para não usar o @Autowired e ficar dependente do framework
    private BookClient bookClient;

    public BookService(BookClient client){
        this.bookClient = client;
    }

    public List<Book> getBooksFromLibrary(){
        return this.bookClient.getBooks();
    }

}
