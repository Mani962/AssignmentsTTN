package com.ttn.springthymeleaf.springthymeleafA.controller;

import com.ttn.springthymeleaf.springthymeleafA.QuestionFour.EmployeeFour;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
public class Employeecontroller {
    /*Question 3*/
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String showRegisteredData(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String competency = request.getParameter("competency");
        int salary = Integer.parseInt(request.getParameter("salary"));
        String mentor = request.getParameter("mentor");
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        model.addAttribute("competency", competency);
        model.addAttribute("salary", salary);
        model.addAttribute("mentor", mentor);
        return "showemployee";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String sayHElloForm() {
        return "registration";
    }

    /*Question 4*/
    @RequestMapping(value = "/employeefourth", method = RequestMethod.GET)
    public String showEmployee(Model model) {
        List<EmployeeFour> employeeList = Arrays.asList(new EmployeeFour("manidhar", "mani", "JVM", 12334, "PRATISH"),
                new EmployeeFour("Vineet", "Chaudary", "ANDROID", 45522, "richa"));
        model.addAttribute("employeefour", employeeList);
        return "showemployeefourth";
    }

    //Queston 5
    @RequestMapping(value = "/checkAdmin", method = RequestMethod.POST)
    public String isAdmin(HttpServletRequest request, Model model) {
        String value = request.getParameter("admin");
        model.addAttribute("isAdmin", value);
        return "checkadmin";
    }

    @RequestMapping(value = "/checkAdmin", method = RequestMethod.GET)
    public String passAdminValue() {
        return "formtocheckadmin";
    }
}