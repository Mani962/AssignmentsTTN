package com.aop.springintermedate;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionOne {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("springi-config.xml");
        ctx.start();
        Student student = ctx.getBean("student", Student.class);
        System.out.println("------------Name: " + student.getName() + "   ID: " + student.getId());

        ctx.stop();
        ctx.close();
    }

}

class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}