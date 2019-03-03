package com.designpatterns;

interface Student1 {
    void getStudentRecord(String user);
}

class RealUser implements Student1 {

    @Override
    public void getStudentRecord(String user) {
        System.out.println(user + " accessing student's records.");
    }
}

class ProxyUser implements Student1 {

    @Override
    public void getStudentRecord(String user) {
        if (user.equalsIgnoreCase("admin")) {
            System.out.println(user + " accessing student's records.");
        } else {
            System.out.println("Access denied.");
        }
    }
}

public class q8 {

    public static void main(String[] args) {

        Student1 student = new ProxyUser();
        student.getStudentRecord("Admin");

        Student1 student1 = new ProxyUser();
        student1.getStudentRecord("Director");
    }
}