package com.ttn.hibernate.QuestionThree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class ApplicationThree {
    public static void main(String[] args) {
        AuthorThree author=new AuthorThree();
        author.setFirstName("manidhar");
        author.setLastName("tamarala");
        author.setAge(22);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
