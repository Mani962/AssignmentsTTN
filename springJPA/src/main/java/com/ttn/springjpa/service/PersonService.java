package com.ttn.springjpa.service;

import com.ttn.springjpa.entity.Person;
import com.ttn.springjpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    Person person = new Person();
    Person person1 = new Person();
    Person person2 = new Person();
    Person person3 = new Person();
    Person person4 = new Person();


    public void savePerson() {

        person.setAge(24);
        person.setFirstName("Manidhar");
        person.setLastName("Tamarala");
        person.setSalary(13382);
        personRepository.save(person);

        person1.setAge(25);
        person1.setFirstName("Smriti");
        person1.setLastName("Babbar");
        person1.setSalary(13782);
        personRepository.save(person1);

        person2.setAge(29);
        person2.setFirstName("Peter");
        person2.setLastName("Parker");
        person2.setSalary(14000);
        personRepository.save(person2);

        person3.setAge(25);
        person3.setFirstName("Peter");
        person3.setLastName("Roxy");
        person3.setSalary(13922);
        personRepository.save(person3);

        person4.setAge(27);
        person4.setFirstName("Reshma");
        person4.setLastName("Mohan");
        person4.setSalary(15000);
        personRepository.save(person4);

    }

//q3. find one method

    public Person findOne() {
        return personRepository.findOne(3);
    }

//    q3. exists method

    public boolean exists() {
        return personRepository.exists(5);
    }


//    q3 findall method

    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    //Q3 	Iterable<T> findAll(Iterable<ID> ids) METHOD

//
//    public void findAll(){
//        return personRepository.findAll(Iterable<Person> ids);
//    }

//    q3 long count() METHOD

    public long count() {

        return personRepository.count();
    }

    //  q3.   void delete(ID id) method
    public void delete(int id) {
        System.out.println("Deleting record of id " + id + "......");
        personRepository.delete(id);
        System.out.println("Deleted record of id " + id + "......");

    }


    //    QUESTION 4 and 5
    public List<Person> findPersonByFirstName(String name) {
        return personRepository.findByFirstName(name);
    }

    public List<Person> findPersonByLastName(String name) {
        return personRepository.findByLastName(name);
    }

    public List<Person> findPersonById(int id) {
        return personRepository.findById(id);
    }
/*
    public List<Person> findPersonByFirstname(int age) {
        return personRepository.findPersonByFirstname(age);
    }*/

    public List<String> findPersonByFirstName(Integer age) {
        return personRepository.findPersonByFirstname(age);
    }

    public void findPersonByFirstNameAndLastName(Integer age) {
        List<Object[]> list = personRepository.findPersonByFirstNameAndLastName(age);
        Iterator<Object[]> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object[] objects = iterator.next();
            System.out.println(objects[0] + " " + objects[1]);
        }
    }

    public void allDataByAge(Integer age) {
        List<Person> data = personRepository.allDataByAge(age);
        Iterator<Person> iterator = data.iterator();
        while (iterator.hasNext()) {
            Person objects = iterator.next();
            System.out.println(objects);
        }
    }

    public Integer countByFirstName(String firstName) {
        return personRepository.countByFirstName(firstName);
    }

    public void findByAgeGreaterThanAndOrderByIdDesc(Integer age) {
        List<Person> list = personRepository.findByAgeGreaterThanOrderByIdDesc(age);
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /*Question 12*/
    public void findAll(Integer age, Sort sort) {
        List<Person> list = personRepository.findAll(age, sort);
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //Question 13
    public void findAll(Pageable pageable) {
        Page<Person> page = personRepository.findAll(pageable);
        System.out.println(page.getContent());
    }

}
