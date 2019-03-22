package com.ttn.hibernate.QuestionSixteenA;

import javax.persistence.*;

@Entity
public class BookSixteenA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookName;
    @ManyToOne
    AuthorSixteenA author;

    public AuthorSixteenA getAuthor() {
        return author;
    }

    public void setAuthor(AuthorSixteenA author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;

    }
}