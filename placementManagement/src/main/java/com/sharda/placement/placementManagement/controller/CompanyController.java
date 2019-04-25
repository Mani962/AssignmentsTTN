package com.sharda.placement.placementManagement.controller;

import com.sharda.placement.placementManagement.entities.Company;
import com.sharda.placement.placementManagement.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping("/registerCompany")
    public ModelAndView insert(@RequestParam(value = "companyName") String companyname, @RequestParam(value = "companyAddress") String companyaddress, @RequestParam(value = "password") String password,
                               @RequestParam(value = "mobileNumber") Integer mobile) {
        System.out.println(mobile);
        ModelAndView modelAndView = new ModelAndView("CompanyRegistration");
        companyService.insert(new Company(companyname, companyaddress, password, mobile));
        return modelAndView;
    }


}
