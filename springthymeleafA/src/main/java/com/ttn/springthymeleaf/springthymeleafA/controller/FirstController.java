package com.ttn.springthymeleaf.springthymeleafA.controller;


import com.ttn.springthymeleaf.springthymeleafA.QuestionTen.EmployeeTen;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RequestMapping("/")
@Controller
public class FirstController {
//QUESTION 1

    @GetMapping("first")
    public String sayhello() {
        return "hello";

    }
//QUESTION 2

    @GetMapping("second")
    public String helloWorld() {
        return "helloworld";
    }


    //QUESTION 6

    @RequestMapping(value = "/headerandfooter", method = RequestMethod.GET)
    public String headerAndFooter() {
        return "footer";
    }
//question 7

    @RequestMapping(value = "/showtime")
    public String showTime() {
        return "ajaxtime";
    }

    @RequestMapping(value = "/getTime", method = RequestMethod.GET)
    @ResponseBody
    public String getTime() {
        return new Date().toLocaleString();
    }

    /*Question 8*/
    @RequestMapping(value = "/condition", method = RequestMethod.GET)
    public String conditionalTag() {
        return "conditionalEight";
    }


    //    Question 9
    @RequestMapping(value = "/showEnums", method = RequestMethod.GET)
    public String showEnums() {
        return "getEnum";
    }

    //Question 10

    @RequestMapping(value = "/showLoader")
    public String showLoader() {
        return "registrationTen";
    }

    @PostMapping("/registrationSubmit")
    @ResponseBody
    public String registerEmployee(@ModelAttribute EmployeeTen employeeTen) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Registered: " + employeeTen.getName() + "\n" + employeeTen.getAge();
    }
}
