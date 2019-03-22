package com.ttn.hibernate.QuestionNine;

import com.ttn.hibernate.QuestionThree.AuthorThree;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ApplicationNine {
    public static void main(String[] args) {
        AuthorNine author=new AuthorNine();
        author.setName("manidhar");
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