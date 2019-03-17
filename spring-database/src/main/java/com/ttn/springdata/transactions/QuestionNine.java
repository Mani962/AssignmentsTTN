package com.ttn.springdata.transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionNine {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        FetchUser fetchUser = ctx.getBean(FetchUser.class);
        System.out.println(fetchUser.getUser("chinnu"));
    }
}


class UserMapper implements RowMapper<user> {

    @Override
    public user mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new user(rs.getString("username"), rs.getString("password"),
                rs.getString("name"), rs.getDate("dob").toString(), rs.getInt("age"));
    }
}

@Repository
class FetchUser {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public FetchUser(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    user getUser(String name) {
        String sql = "SELECT * FROM user WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{name}, new UserMapper());
    }
}