package com.ttn.hibernate.QuestionFourteenandFifteen;
import com.ttn.hibernate.QuestionTenandEleven.Address;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
@Entity
public class AuthorFifteen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "author_firstName")
    private String firstName;
    @Column(name = "author_lastName")
    private String lastName;
    @Column(name = "author_age")
    private int age;
    @Column(name = "author_dob")
    @Temporal(TemporalType.DATE)
    @Transient
    private Date dob;
    @Embedded
    private Address address;
    @ElementCollection
    private Set<String> subjects;
    @OneToOne
    @JoinColumn(name = "join_book_column")
    private Book book;

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public Set<String> getSubjects() {
        return subjects;
    }
    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address +
                ", subjects=" + subjects +
                ", book=" + book +
                '}';
    }
}