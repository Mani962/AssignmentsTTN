package com.ttn.springjpa;

import com.ttn.springjpa.service.PersonTenService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTen {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("com.ttn.springjpa.config", "com.ttn.springjpa.service");
        PersonTenService personTenService = ctx.getBean(PersonTenService.class);
        personTenService.savePerson();
//        Integer count1 =  personTenService.countByMethodOfPersonRepository("Peter");
//        System.out.println("Number of People From Peter Name is : " + count1);
//        PersonTen person=personTenService.findDistinctPersonByName("manidhar");
//        System.out.println(person);

//        System.out.println("This is through Name");
//       personTenService.findByFirstNameOrAge("manidhar",24);
//        System.out.println("\n");
//        System.out.println("This is through Age");
//      personTenService.findByFirstNameOrAge("sdfaasd",21);

//        System.out.println("This is through And Method of Person");
//        personTenService.findByFirstNameAndAge("Manidhar",24);

//        System.out.println("This is example of between");
//        personTenService.findByAgeBetween(20,30);

//        System.out.println("This is example of Less Than");
//        personTenService.findByAgeLessThan(25);

//        System.out.println("This is example of Greater Than");
//        personTenService.findByAgeGreaterThan(25);

//        System.out.println("This is example of Like Method");
//        personTenService.findByFirstNameLike("%S%");

//        System.out.println("This is example of Not Method");
//        personTenService.findByFirstNameNot("Peter");
//
//        System.out.println("This is example of In Method");
//        personTenService.findByAgeIn(Arrays.asList(23,25,27));
        System.out.println("This is example of Ignore Method");
        personTenService.findByFirstNameIgnoreCase("manidhar");

    }
}

