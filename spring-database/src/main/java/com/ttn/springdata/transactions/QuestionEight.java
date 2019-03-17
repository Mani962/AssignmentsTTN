package com.ttn.springdata.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

public class QuestionEight {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        FetchQueryForList fetchQueryForList = ctx.getBean(FetchQueryForList.class);
        fetchQueryForList.displayRecord();
    }
}

@Repository
class FetchQueryForList {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public FetchQueryForList(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    void displayRecord() {
        String sql = "SELECT * FROM user";
        System.out.println("\n"+jdbcTemplate.queryForList(sql)+ "\n");
    }
}