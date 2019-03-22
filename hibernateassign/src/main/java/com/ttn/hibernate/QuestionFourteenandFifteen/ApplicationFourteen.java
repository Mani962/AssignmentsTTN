package com.ttn.hibernate.QuestionFourteenandFifteen;

import com.ttn.hibernate.QuestionTenandEleven.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ApplicationFourteen {
    public static void main(String[] args) {
        AuthorFifteen author = new AuthorFifteen();
        author.setFirstName("Manidhar");
        author.setLastName("Tamarala");
        author.setAge(21);
        author.setDob(new Date());
        Address address = new Address();
        address.setStreetNumber(2 / 104);
        address.setLocation("Omega1");
        address.setState("Uttar Pradesh");
        author.setAddress(address);
        Set<String> subjects = new HashSet<>();
        subjects.add("Maths");
        subjects.add("physics");
        subjects.add("Chemistry");
        author.setSubjects(subjects);

        Book book = new Book();
        book.setBookName("DAA");
        author.setBook(book);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.save(book);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}