package com.sharda.placement.placementManagement.Repository;


import com.sharda.placement.placementManagement.entities.Company;
import com.sharda.placement.placementManagement.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CompanyRepository extends CrudRepository<Company, Integer> {
}
