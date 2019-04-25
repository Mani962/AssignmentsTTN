package com.sharda.placement.placementManagement.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyid;
    private String companyname;
    private String companyaddress;
    private String companypassword;
    private int companymobilenumber;

    public Company() {

    }

    public Company(String companyname, String companyaddress, String companypassword, int companymobilenumber) {
        this.companyname = companyname;
        this.companyaddress = companyaddress;
        this.companypassword = companypassword;
        this.companymobilenumber = companymobilenumber;
    }

    public int getCompanyid() {
        return companyid;
    }

    public Company setCompanyid(int companyid) {
        this.companyid = companyid;
        return this;
    }

    public String getCompanyname() {
        return companyname;
    }

    public Company setCompanyname(String companyname) {
        this.companyname = companyname;
        return this;
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public Company setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress;
        return this;
    }

    public String getCompanypassword() {
        return companypassword;
    }

    public Company setCompanypassword(String companypassword) {
        this.companypassword = companypassword;
        return this;
    }

    public int getCompanymobilenumber() {
        return companymobilenumber;
    }

    public Company setCompanymobilenumber(int companymobilenumber) {
        this.companymobilenumber = companymobilenumber;
        return this;
    }
}