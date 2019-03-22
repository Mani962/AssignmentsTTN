package com.ttn.hibernate.QuestionSixteenB;
import javax.persistence.*;
@Entity

public class BookSixteenB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String bookName;
    @ManyToOne
    AuthorSixteenB author;
    public AuthorSixteenB getAuthor() {
        return author;
    }
    public void setAuthor(AuthorSixteenB author) {
        this.author = author;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}