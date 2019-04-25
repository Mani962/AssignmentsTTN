package com.sharda.placement.placementManagement.controller;


import com.sharda.placement.placementManagement.entities.Student;
import com.sharda.placement.placementManagement.service.AdminService;
import com.sharda.placement.placementManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    /*@Autowired
    AdminService adminService;

    @PostMapping("/login")
    public ModelAndView login(@RequestParam(value = "emailname") String email, @RequestParam(value = "pass") String password) {
        if (email != null && password != null) {
            Student student = adminService.getDetailsForLogin(email, password);
            if (student != null) {
                ModelAndView modelAndView = new ModelAndView("Sdashboard");
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
    }*/


}