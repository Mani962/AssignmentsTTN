package com.sharda.placement.placementManagement.Repository;


import com.sharda.placement.placementManagement.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    Student findByEmailAndPasswordAndActive(String email, String password, Boolean active);
}
