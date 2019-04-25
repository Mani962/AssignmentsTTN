package com.sharda.placement.placementManagement.Repository;


import com.sharda.placement.placementManagement.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Student,Integer> {
}
