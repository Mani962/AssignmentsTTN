package com.sharda.placement.placementManagement.controller;

import com.sharda.placement.placementManagement.entities.Student;
import com.sharda.placement.placementManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    HttpSession httpSession;

    @RequestMapping("/studentRegistration")
    public String displayRegistration() {
        return "signupstudent";
    }

    @PostMapping("/register")
    public ModelAndView insert(@RequestParam(value = "rollNo") Integer roll, @RequestParam(value = "userName") String username, @RequestParam(value = "password") String password,
                               @RequestParam(value = "email") String email, @RequestParam(value = "mobilenumber") Integer mobile) {
        System.out.println(mobile);
        ModelAndView modelAndView = new ModelAndView("signupstudent");
        studentService.insert(new Student(username, password, email, mobile, roll));
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@RequestParam(value = "emailname") String email, @RequestParam(value = "pass") String password) {
        if (email != null && password != null) {
            Student student = studentService.getDetailsForLogin(email, password);
            if (student != null) {
                ModelAndView modelAndView = new ModelAndView("Sdashboard");
                System.out.println(email);
                httpSession.setAttribute("email","email");
                httpSession.setAttribute("rollno","rollno");
                modelAndView.addObject("email", email);
                modelAndView.addObject("password", password);

                return modelAndView;
            } else {
                ModelAndView modelAndView = new ModelAndView("Wrong");
                return modelAndView;
            }
        } else {
            ModelAndView modelAndView = new ModelAndView("login1");
            return modelAndView;
        }
    }

    @RequestMapping("/UpdateProfile")
    public ModelAndView displayLogin()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("email",httpSession.getAttribute("email"));
        return modelAndView;
    }

}
