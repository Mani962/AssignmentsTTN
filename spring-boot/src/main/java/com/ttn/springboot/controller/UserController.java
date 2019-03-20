package com.ttn.springboot.controller;

import com.ttn.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    User user;
    @GetMapping("/user")
    @ResponseBody
    public String getUser(){
        return "Username is :"+user.getUsername() +"\n" +"Password is :"+user.getPassword();
    }

}
