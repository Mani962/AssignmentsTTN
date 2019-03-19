package com.ttn.jaffa.Question7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

// Question 7
@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/firstnameAndLastname/{firstname}/{lastname}")
    @ResponseBody
    String returnNames(@PathVariable Map<String, String> requestMap) {
        return "Firstname: " + requestMap.get("firstname") + " Lastname: " + requestMap.get("lastname");
    }
}