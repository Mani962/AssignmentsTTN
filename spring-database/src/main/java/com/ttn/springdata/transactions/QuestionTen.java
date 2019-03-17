package com.ttn.springdata.transactions;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

public class QuestionTen {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDAO ud= ctx.getBean(UserDAO.class);
        ud.sessionFactoryDemo();
    }
}

@Repository
class UserDAO {
    private final SessionFactory sessionFactoryBean;
    @Autowired
    public UserDAO(SessionFactory sessionFactoryBean) {
        this.sessionFactoryBean = sessionFactoryBean;
    }
    void sessionFactoryDemo() {
        String sql = "SELECT COUNT(*) FROM user";
        org.hibernate.Query query;
        query = sessionFactoryBean.openSession().createQuery(sql);
        System.out.println("\nNumber of records: "+query.uniqueResult());
    }
}
