package com.sharda.placement.placementManagement.service;

import com.sharda.placement.placementManagement.Repository.AdminRepository;
import com.sharda.placement.placementManagement.Repository.StudentRepository;
import com.sharda.placement.placementManagement.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminService {

    @Autowired
    AdminRepository adminRepository;

//
//    public Ad getDetailsForLogin(String email, String pass) {
//        Student student = adminRepository.findByEmailAndPasswordAndActive(email, pass, true);
//        return student;
//    }
}
