package com.sharda.placement.placementManagement.service;

import com.sharda.placement.placementManagement.Repository.CompanyRepository;
import com.sharda.placement.placementManagement.entities.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {


    @Autowired
    CompanyRepository companyRepository;

    public void insert(Company company) {
        companyRepository.save(company);
    }

}
