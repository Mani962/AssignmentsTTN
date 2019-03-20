package com.ttn.springboot.controller;

import com.ttn.springboot.entity.Student;
import com.ttn.springboot.event.Bootstrap;
import com.ttn.springboot.service.StudentDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;
//import java.util.logging.Logger;

@RestController
public class StudentController {
    @Autowired
    StudentDetails studentDetails;
    @Autowired
    Bootstrap bootstrap;
    Logger logger=(Logger) LoggerFactory.getLogger(StudentController.class);
    @GetMapping("/Students")
    public List<Student> getStudents() {
        bootstrap.init();
        logger.info("ENTER THE STUDENTS");
        return studentDetails.getStudents();
    }
}
