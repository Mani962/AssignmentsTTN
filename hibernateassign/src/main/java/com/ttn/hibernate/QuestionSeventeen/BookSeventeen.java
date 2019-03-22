package com.ttn.hibernate.QuestionSeventeen;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookSeventeen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String bookName;
    @ManyToMany
    List<AuthorSeventeen> authors = new ArrayList<>();
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public List<AuthorSeventeen> getAuthors() {
        return authors;
    }
    public void setAuthors(List<AuthorSeventeen> authors) {
        this.authors = authors;
    }
}