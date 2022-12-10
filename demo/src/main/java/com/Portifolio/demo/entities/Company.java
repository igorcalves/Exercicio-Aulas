package com.Portifolio.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "TB_COMPANY")
public class Company {
    
    private String companyName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  

    public Long getId() {
        return id;
    }

    public Company(){}

    public Company(String companyName){
        this.companyName= companyName;
    }

    @OneToMany(mappedBy = "company")
    private List<JobFunction> companyJobFunctions = new ArrayList<>();

    @OneToMany(mappedBy = "company")
    private List<CompanyEmployee> companyEmployees = new ArrayList<>(); 


    public  List<JobFunction> getCompanyJobFunctions() {
        return this.companyJobFunctions;
    }


    public  List<CompanyEmployee> getCompanyEmployees() {
        return this.companyEmployees;
    }


    public String getCompanyName() {
        return companyName;
    }

    
   

  



   

    

    

}
