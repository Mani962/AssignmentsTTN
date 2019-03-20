package com.ttn.springboot.service;

import com.ttn.springboot.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentDetails {
    public List<Student> getStudents(){
        return Arrays.asList(new Student(1,"manidhar","JVM"),
                new Student(2,"smriti babbar","android"),
                new Student(3,"shivam","ios"),
                new Student(4,"sanjeev","DEVOPS"));
    }

}
