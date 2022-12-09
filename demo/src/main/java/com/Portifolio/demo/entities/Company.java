package com.Portifolio.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Company {
    
    private String companyName;

  

    public Company(){}

    public Company(String companyName){
        this.companyName= companyName;
    }

    private List<JobFunction> companyJobFunctions = new ArrayList<>();

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
