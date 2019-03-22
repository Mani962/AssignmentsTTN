package com.ttn.hibernate.QuestionOneandTwo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {
        //create

   /* Author author=new Author();
        author.setFirstName("MANIDHAR");
        author.setLastName("TAMARALA");
        author.setAge(29);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
*/
        // read

        /*SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Author author=session.get(Author.class,"MANIDHAR");
        session.getTransaction().commit();
        session.close();
        System.out.println(author);
*/
        //update

    /*    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Author author=session.get(Author.class,"MANIDHAR");
        author.setLastName("LOVA TAMARALA");
        session.update(author);
        session.getTransaction().commit();
        session.close();
        System.out.println(author);
*/
        //delete

       /* SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Author author=session.get(Author.class,"MANIDHAR");
        session.delete(author);
        session.getTransaction().commit();
        session.close();
        System.out.println(author);*/


    }
}
