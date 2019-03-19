// Question 6
package com.ttn.jaffa.Question6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/usernameAndPassword/{username}/{password}")
    @ResponseBody
    String returnVariables(@PathVariable("username") String uname, @PathVariable("password") String pword) {
        return "Username: " + uname + " Password: " + pword;
    }
}