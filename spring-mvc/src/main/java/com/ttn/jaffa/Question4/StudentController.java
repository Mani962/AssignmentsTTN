package com.ttn.jaffa.Question4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
// Question 4

@Controller
public class StudentController {
    @RequestMapping("/")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello World!!!";
    }
}