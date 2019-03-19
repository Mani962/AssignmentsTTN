package com.ttn.jaffa.Question10;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
    @ModelAttribute
    void addingObject(Model model) {
        model.addAttribute("heading", "Spring MVC Demo");
    }

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index1");
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    @ResponseBody
    ModelAndView submitForm(@ModelAttribute("studentCO") StudentCO studentCO) {
        ModelAndView modelAndView = new ModelAndView("submittedData");
        return modelAndView;
    }
}