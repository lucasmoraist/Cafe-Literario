package com.lucas.cafeliterario.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    
    private String title;

    private String author;

    private String area;

    private String publisher;

    @JsonProperty("year_of_publication")
    private String yearOfPublisher;
    
    public String isbn;

}
