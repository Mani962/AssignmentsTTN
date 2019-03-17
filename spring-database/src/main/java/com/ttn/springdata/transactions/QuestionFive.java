package com.ttn.springdata.transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

public class QuestionFive {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        GetUser getUser = ctx.getBean("getUser", GetUser.class);
        System.out.println("username: "+getUser.getUserName("abhi"));
    }
}

@Repository
class GetUser {

    private final
    JdbcTemplate jdbcTemplate;

    @Autowired
    public GetUser(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    Object getUserName(String name) {
        String sql = "SELECT name FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{name}, String.class);
    }
}