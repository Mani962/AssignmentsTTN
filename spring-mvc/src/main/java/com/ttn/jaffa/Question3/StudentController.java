package com.ttn.jaffa.Question3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Question3
@Controller
public class StudentController {
    @RequestMapping("/")
    public ModelAndView renderPage() {
        ModelAndView modelAndView = new ModelAndView("display");
        return modelAndView;
    }
}
