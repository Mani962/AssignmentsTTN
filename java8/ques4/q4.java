package com.JavaNew;

class Employee {
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}

interface ObjectGenerate {
    Employee getInstance(String name, Integer age, String city);
}

public class q4 {

    public static void main(String[] args) {

        ObjectGenerate objectGenerate = Employee::new;

        Employee emp = objectGenerate.getInstance("Manidhar", 20, "Greater noida");

        System.out.println(emp.name + " " + emp.age + " " + emp.city);


    }
}