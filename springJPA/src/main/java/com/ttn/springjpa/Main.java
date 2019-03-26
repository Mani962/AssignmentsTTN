package com.ttn.springjpa;

import com.ttn.springjpa.service.PersonService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("com.ttn.springjpa.config", "com.ttn.springjpa.service");
        PersonService personService = ctx.getBean(PersonService.class);
//        Q3
        personService.savePerson();

//        Question 5

        System.out.println(personService.findPersonByFirstName("manidhar"));
        System.out.println("\n");
        System.out.println(personService.findPersonByLastName("babbar"));
        System.out.println("\n");
        System.out.println(personService.findPersonById(3));
//        System.out.println(personService.findOne());

//        System.out.println(personService.exists());

//        System.out.println(personService.findAll());

//        System.out.println(personService.count());

        //personService.delete(1);
//  QUESTION 6
   /*     List<String> list = personService.findPersonByFirstName(25);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

//       personService.findPersonByFirstNameAndLastName(25);

//        personService.allDataByAge(25);

//        System.out.println(personService.countByFirstName("Peter"));

//        System.out.println("This function print person greater than 25 and order by id in Descending order");
//        personService.findByAgeGreaterThanAndOrderByIdDesc(25);

//        Question 12
//        System.out.println("This is through Sort Class");
//        personService.findAll(25, new Sort(Sort.Direction.DESC, "id"));

//        /*Question 13*/
//        System.out.println("This is of Pageable type");
//        personService.findAll(new PageRequest(2,3));

    }

}
