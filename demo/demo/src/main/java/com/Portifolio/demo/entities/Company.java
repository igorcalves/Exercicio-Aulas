package com.Portifolio.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Company {
    
    final String companyName = "AllSafe";

    Date companyDateCreate; 

    private List<JobFunction> companyJobFunctions = new ArrayList<>();

    private List<CompanyEmployee> companyEmployees = new ArrayList<>(); 


    public  List<JobFunction> getCompanyJobFunctions() {
        return companyJobFunctions;
    }


    public  List<CompanyEmployee> getCompanyEmployees() {
        return companyEmployees;
    }


    public String getCompanyName() {
        return companyName;
    }

  

    public Date getCompanyDateCreate() {
        return companyDateCreate;
    }

    public void setCompanyDateCreate(Date companyDateCreate) {
        this.companyDateCreate = companyDateCreate;
    }

    

}
