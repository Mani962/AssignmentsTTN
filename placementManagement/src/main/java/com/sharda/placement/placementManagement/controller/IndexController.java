package com.sharda.placement.placementManagement.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String display()
    {
        return "index";
    }
    @RequestMapping("/login")
    public String displayLogin()
    {
        return "login1";
    }


}
