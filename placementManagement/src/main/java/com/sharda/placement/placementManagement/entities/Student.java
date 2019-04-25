package com.sharda.placement.placementManagement.entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
public class Student {

    public Student() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int StudentId;
    private String username;
    private String password;
    private String email;
    private int mobilenumber;
    private int rollno;
    private int TenthPercentage;
    private int TwelthPercentage;
    private int BtechPercentage;
    private boolean active;

    public Student(String username, String password, String email, Integer mobilenumber, Integer rollno) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobilenumber = mobilenumber;
        this.rollno = rollno;
        this.TenthPercentage = 0;
        this.TwelthPercentage = 0;
        this.BtechPercentage = 0;
        this.active = true ;
    }


    public boolean isActive() {
        return active;
    }

    public Student setActive(boolean active) {
        this.active = active;
        return this;
    }


    public int getStudentId() {
        return StudentId;
    }

    public Student setStudentId(int studentId) {
        StudentId = studentId;
        return this;
    }


    public String getUsername() {
        return username;
    }

    public Student setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Student setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public Student setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
        return this;
    }

    public int getRollno() {
        return rollno;
    }

    public Student setRollno(int rollno) {
        this.rollno = rollno;
        return this;
    }

    public int getTenthPercentage() {
        return TenthPercentage;
    }

    public Student setTenthPercentage(int tenthPercentage) {
        TenthPercentage = tenthPercentage;
        return this;
    }

    public int getTwelthPercentage() {
        return TwelthPercentage;
    }

    public Student setTwelthPercentage(int twelthPercentage) {
        TwelthPercentage = twelthPercentage;
        return this;
    }

    public int getBtechPercentage() {
        return BtechPercentage;
    }

    public Student setBtechPercentage(int btechPercentage) {
        BtechPercentage = btechPercentage;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobilenumber=" + mobilenumber +
                ", rollno=" + rollno +
                ", TenthPercentage=" + TenthPercentage +
                ", TwelthPercentage=" + TwelthPercentage +
                ", BtechPercentage=" + BtechPercentage +
                ", active=" + active +
                '}';
    }
}
