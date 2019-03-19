package com.ttn.jaffa.Question5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    /*Question 5*/
    @RequestMapping("/send")
    public ModelAndView printHelloWorld() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("helloworld", "Hello World");
        return modelAndView;
    }

    @RequestMapping("/send1")
    public ModelAndView printHelloWorld1() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("human", "Hello World human");
        return modelAndView;
    }

}