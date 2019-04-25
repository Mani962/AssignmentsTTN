package com.sharda.placement.placementManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlacementController {
    @RequestMapping("/placementRegistration")
    public String displayRegistration()
    {
        return "CompanyRegistration";
    }
}
