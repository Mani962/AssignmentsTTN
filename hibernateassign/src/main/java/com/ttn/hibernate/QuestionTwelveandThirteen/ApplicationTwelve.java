package com.ttn.hibernate.QuestionTwelveandThirteen;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ApplicationTwelve {
    public static void main(String[] args) {

        AuthorTwelve authorTwelve=new AuthorTwelve();
        authorTwelve.setName("manidhar");
        authorTwelve.setAge(32);
        authorTwelve.getSubjects().add("English");
        authorTwelve.getSubjects().add("Maths");
        authorTwelve.getSubjects().add("Science");
        authorTwelve.getSubjects().add("Computer");
        authorTwelve.getSubjects().add("Social");
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(authorTwelve);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
