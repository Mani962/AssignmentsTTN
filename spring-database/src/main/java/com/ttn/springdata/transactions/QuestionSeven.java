package com.ttn.springdata.transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

public class QuestionSeven {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        FetchQueryForMap fetchQueryForMap = ctx.getBean(FetchQueryForMap.class);
        fetchQueryForMap.display("manidhar");
    }
}

@Repository
class FetchQueryForMap{

    @Autowired
    JdbcTemplate jdbcTemplate;

    void display(String name) {
        String sql = "SELECT * FROM user WHERE name = ?";
        System.out.println(jdbcTemplate.queryForMap(sql, new Object[]{name}));
    }
}