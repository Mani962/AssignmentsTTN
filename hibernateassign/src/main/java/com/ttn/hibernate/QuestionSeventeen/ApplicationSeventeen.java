package com.ttn.hibernate.QuestionSeventeen;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class ApplicationSeventeen {
    public static void main(String[] args) {
        AuthorSeventeen author1 = new AuthorSeventeen();
        author1.setFname("Manidhar");
        author1.setLname("tamarala");
        author1.setAge(34);
        author1.setDob(new Date());
        AuthorSeventeen author2 = new AuthorSeventeen();
        author2.setFname("girish");
        author2.setLname("Verma");
        author2.setAge(45);
        author2.setDob(new Date());
        BookSeventeen book1 = new BookSeventeen();
        book1.setBookName("Computer Organization");
        BookSeventeen book2 = new BookSeventeen();
        book2.setBookName("Java Programming");
        author1.getBooks().add(book1);
        author1.getBooks().add(book2);
        book1.getAuthors().add(author1);
        book2.getAuthors().add(author1);
        author2.getBooks().add(book1);
        author2.getBooks().add(book2);
        book1.getAuthors().add(author2);
        book2.getAuthors().add(author2);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(author1);
        session.persist(author2);
        session.getTransaction().commit();
        session.close();
    }
}