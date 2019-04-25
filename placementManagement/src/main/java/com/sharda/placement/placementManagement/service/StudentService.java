package com.sharda.placement.placementManagement.service;

import com.sharda.placement.placementManagement.Repository.StudentRepository;
import com.sharda.placement.placementManagement.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void insert(Student student) {
        studentRepository.save(student);
    }

    public Student getDetailsForLogin(String email, String pass) {
        Student student = studentRepository.findByEmailAndPasswordAndActive(email, pass, true);
        return student;
    }

}


