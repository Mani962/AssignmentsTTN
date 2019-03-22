package com.ttn.hibernate.QuestionTenandEleven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ApplicationTen {
    public static void main(String[] args) {

        AuthorTen authorTen=new AuthorTen();
        authorTen.setName("manidhar");
        authorTen.setAge(32);
        Address address=new Address();
        address.setStreetNumber(137);
        address.setLocation("Greater noida");
        address.setState("uttar pradesh");
        authorTen.setAddress(address);
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(authorTen);
        session.getTransaction().commit();
        session.close();
    }
}
