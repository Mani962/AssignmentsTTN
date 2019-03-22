package com.ttn.hibernate.QuestionThree;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;


@Entity
public class AuthorThree {
    @Id
    private String firstName;
    private String lastName;
    private Integer age;
    @Temporal(TemporalType.DATE)
    Date date;

    public AuthorThree() {
    }

    public AuthorThree(String firstName, String lastName, Integer age, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AuthorThree{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
