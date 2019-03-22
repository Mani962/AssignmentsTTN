package com.ttn.hibernate.QuestionSixteen;

import com.ttn.hibernate.QuestionTenandEleven.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ApplicationSixteen {
    public static void main(String[] args) {
        AuthorSixteen author = new AuthorSixteen();
        author.setFirstName("ayya");
        author.setLastName("avuna");
        author.setAge(21);
        author.setDob(new Date());
        Address address = new Address();
        address.setStreetNumber(5/137);
        address.setLocation("Alpha 1");
        address.setState("Uttar Pradesh");
        author.setAddress(address);
        Set<String> subjects = new HashSet<>();
        subjects.add("Maths");
        subjects.add("physics");
        subjects.add("Chemistry");
        author.setSubjects(subjects);
        BookSixteen bookSixteen = new BookSixteen();
        bookSixteen.setBookName("DAA");
        BookSixteen bookSixteen1 = new BookSixteen();
        bookSixteen1.setBookName("Computer Networks");
        BookSixteen bookSixteen2 = new BookSixteen();
        bookSixteen2.setBookName("TAFN");
        author.getBookSixteenListForAuthor().add(bookSixteen);
        author.getBookSixteenListForAuthor().add(bookSixteen1);
        author.getBookSixteenListForAuthor().add(bookSixteen2);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.save(bookSixteen);
        session.save(bookSixteen1);
        session.save(bookSixteen2);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}