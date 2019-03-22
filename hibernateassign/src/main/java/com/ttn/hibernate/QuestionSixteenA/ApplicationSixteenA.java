package com.ttn.hibernate.QuestionSixteenA;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class ApplicationSixteenA {
    public static void main(String[] args) {
        AuthorSixteenA author = new AuthorSixteenA();
        author.setFname("Anjali");
        author.setLname("Sharma");
        author.setAge(35);
        author.setDob(new Date());
        BookSixteenA book1 = new BookSixteenA();
        book1.setBookName("Data Structure");
        book1.setAuthor(author);
        BookSixteenA book2 = new BookSixteenA();
        book2.setBookName("Data Warehouse");
        book2.setAuthor(author);
        author.getBooks().add(book1);
        author.getBooks().add(book2);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(author);
        session.persist(book1);
        session.persist(book2);
        session.getTransaction().commit();
        session.close();
    }
}