package com.ttn.springjpa.service;

import com.ttn.springjpa.entity.PersonTen;
import com.ttn.springjpa.repository.PersonTenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class PersonTenService {
    @Autowired
    PersonTenRepository personTenRepository;

    PersonTen person = new PersonTen();
    PersonTen person1 = new PersonTen();
    PersonTen person2 = new PersonTen();
    PersonTen person3 = new PersonTen();
    PersonTen person4 = new PersonTen();

    public void savePerson() {

        person.setAge(24);
        person.setFirstName("Manidhar");
        person.setLastName("Tamarala");
        person.setSalary(13382);
        personTenRepository.save(person);

        person1.setAge(25);
        person1.setFirstName("Smriti");
        person1.setLastName("Babbar");
        person1.setSalary(13782);
        personTenRepository.save(person1);

        person2.setAge(29);
        person2.setFirstName("Peter");
        person2.setLastName("Parker");
        person2.setSalary(14000);
        personTenRepository.save(person2);

        person3.setAge(25);
        person3.setFirstName("Peter");
        person3.setLastName("Roxy");
        person3.setSalary(13922);
        personTenRepository.save(person3);

        person4.setAge(27);
        person4.setFirstName("Reshma");
        person4.setLastName("Mohan");
        person4.setSalary(15000);
        personTenRepository.save(person4);

    }

    /*Question 10*/
    public Integer countByMethodOfPersonRepository(String Name) {
        return personTenRepository.countPersonByFirstName(Name);
    }

    public PersonTen findDistinctPersonByName(String name) {
        return personTenRepository.findDistinctByFirstName(name);
    }

    public void findByFirstNameOrAge(String name, Integer age) {
        List<PersonTen> list = personTenRepository.findByFirstNameOrAge(name, age);
        Iterator<PersonTen> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void findByFirstNameAndAge(String name, Integer age) {
        List<PersonTen> list = personTenRepository.findByFirstNameAndAge(name, age);
        Iterator<PersonTen> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void findByAgeBetween(int min, int max) {
        List<PersonTen> list = personTenRepository.findByAgeBetween(min, max);
        Iterator<PersonTen> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void findByAgeLessThan(int number) {
        List<PersonTen> list = personTenRepository.findByAgeLessThan(number);
        Iterator<PersonTen> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void findByAgeGreaterThan(int number) {
        List<PersonTen> list = personTenRepository.findByAgeGreaterThan(number);
        Iterator<PersonTen> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void findByFirstNameLike(String name) {
        List<PersonTen> list = personTenRepository.findByFirstNameLike(name);
        Iterator<PersonTen> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void findByFirstNameNot(String name) {
        List<PersonTen> list = personTenRepository.findByFirstNameNot(name);
        Iterator<PersonTen> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

  /*  public void findByAgeIn(List<Integer> agelist) {
        List<PersonTen> list = personTenRepository.findByAgeIn(agelist);
        Iterator<PersonTen> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }*/

    public void findByFirstNameIgnoreCase(String string) {
        List<PersonTen> list = personTenRepository.findByFirstNameIgnoreCase(string);
        Iterator<PersonTen> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}