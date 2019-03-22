package com.ttn.hibernate.QuestionSixteenA;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Entity
public class AuthorSixteenA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;
    @Column(name = "First_Name")
    private String fname;
    @Column(name = "Last_Name")
    private String lname;
    @Column(name = "Age")
    private int age;
    @Temporal(TemporalType.DATE)
    @Column(name = "Date_of_Birth")
    private Date dob;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(joinColumns = @JoinColumn(name="Author_Id")
            ,inverseJoinColumns = @JoinColumn(name = "Book_Id"))
    Set<BookSixteenA> books = new HashSet<>();
    public Set<BookSixteenA> getBooks() {
        return books;
    }
    public void setBooks(Set<BookSixteenA> books) {
        this.books = books;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
}