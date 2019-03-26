package com.ttn.springjpa.repository;

import com.ttn.springjpa.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {


    // Q4
    List<Person> findByFirstName(String name);

    List<Person> findByLastName(String name);

    List<Person> findById(Integer id);

    //    QUESTION 6
    @Query("SELECT firstName from Person where age=:age")
    List<String> findPersonByFirstname(@Param("age") Integer age);

    //    question 7
    @Query("SELECT firstName ,lastName from Person where age=:age")
    List<Object[]> findPersonByFirstNameAndLastName(@Param("age") Integer age);

    //Question 8
    @Query("SELECT e FROM  Person e where age=:age")
    List<Person> allDataByAge(@Param("age") Integer age);

    //Question 9
    @Query("select count(e) from Person e where firstName=:firstName")
    Integer countByFirstName(@Param("firstName") String firstName);

//    Question 11

    List<Person> findByAgeGreaterThanOrderByIdDesc(Integer age);

    /*Queston 12*/
    @Query("select e from Person e where age>:age")
    List<Person> findAll(@Param("age") Integer age, Sort sort);

    //    Question 13
    Page<Person> findAll(Pageable pageable);

}


