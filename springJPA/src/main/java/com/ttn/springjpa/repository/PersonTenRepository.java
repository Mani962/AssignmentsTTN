package com.ttn.springjpa.repository;

import com.ttn.springjpa.entity.PersonTen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonTenRepository extends CrudRepository<PersonTen, Integer> {

    //    count method
    int countPersonByFirstName(String firstName);

    //distinct method

    PersonTen findDistinctByFirstName(String name);

    List<PersonTen> findByFirstNameOrAge(String fname, Integer age);

    List<PersonTen> findByFirstNameAndAge(String fname, Integer age);

    List<PersonTen> findByAgeBetween(int min, int max);

    List<PersonTen> findByAgeLessThan(int number);

    List<PersonTen> findByAgeGreaterThan(int number);

    List<PersonTen> findByFirstNameLike(String name);

    List<PersonTen> findByFirstNameNot(String name);

    List<PersonTen> findByAgeIn(String agelist);

    List<PersonTen> findByFirstNameIgnoreCase(String name);

}


