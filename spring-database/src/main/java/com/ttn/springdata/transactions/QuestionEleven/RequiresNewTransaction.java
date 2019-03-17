package com.ttn.springdata.transactions.QuestionEleven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class RequiresNewTransaction {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDaoRequiresNew1 userDaoRequiresNew1 = ctx.getBean(UserDaoRequiresNew1.class);
        userDaoRequiresNew1.insert();
    }
}

@Repository
class UserDaoRequiresNew1 {

    private final
    JdbcTemplate jdbcTemplate;
    private final
    UserDaoNested2 userDaoRequiresNew2;

    @Autowired
    public UserDaoRequiresNew1(JdbcTemplate jdbcTemplate, UserDaoNested2 userDaoRequiresNew2) {
        this.jdbcTemplate = jdbcTemplate;
        this.userDaoRequiresNew2 = userDaoRequiresNew2;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void insert() {
        jdbcTemplate.update("INSERT INTO PEOPLE(id,name) VALUES (1,'MANIDHAR')");
        try {
            userDaoRequiresNew2.insert();
        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}

@Repository
class UserDaoRequiresNew2 {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoRequiresNew2(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert() {
        jdbcTemplate.update("INSERT INTO PEOPLE(id,name) VALUES (2,'AKU')");
        throw new RuntimeException();
    }
}
