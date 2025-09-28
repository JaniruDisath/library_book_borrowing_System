package edu.janiru.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private long id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String category;
    private Integer availableCopies;
}
