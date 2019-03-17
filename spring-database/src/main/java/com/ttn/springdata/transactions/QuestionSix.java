package com.ttn.springdata.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;

public class QuestionSix {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        RecordInsert recordInsert = ctx.getBean(RecordInsert.class);
        recordInsert.insertUser(new user("nenduu", "csdsdn14", "chdsfinnu", "1964-09-14", 44));

    }
}

@Entity
class user {
    @Id
    private String userName;
    private String password;
    private String name;
    private String dob;
    private int age;


    public user(String userName, String password, String name, String dob, int age) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dob = dob;
        this.age = age;
    }

    String getUserName() {
        return userName;
    }

    String getPassword() {
        return password;
    }

    String getName() {
        return name;
    }

    String getDob() {
        return dob;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "user{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                '}';
    }
}

@Repository
class RecordInsert {
    private final
    JdbcTemplate jdbcTemplate;

    @Autowired
    public RecordInsert(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    void insertUser(user u) {
        System.out.println("Record inserting....");
        String sql = "INSERT INTO user(username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                u.getUserName(), u.getPassword(), u.getName(), u.getAge(), u.getDob()
        });
        System.out.println("Record inserted....");
    }
}