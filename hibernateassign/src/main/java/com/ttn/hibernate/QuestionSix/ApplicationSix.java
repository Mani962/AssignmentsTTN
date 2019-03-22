package com.ttn.hibernate.QuestionSix;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

public class ApplicationSix {
    public static void main(String[] args) {
        AuthorSix author=new AuthorSix();
        author.setFirstName("human");
        author.setLastName("jaffa");
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
