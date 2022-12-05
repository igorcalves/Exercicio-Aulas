package com.Portifolio.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Company {
    
    String companyName;

    Date companyDateCreate;

    List<JobFunction> companyJobFunctions = new ArrayList<>();

    List<CompanyEmployee> companyEmployees = new ArrayList<>();

    public Company(String companyName, Date companyDateCreate) {
        this.companyName = companyName;
        this.companyDateCreate = companyDateCreate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCompanyDateCreate() {
        return companyDateCreate;
    }

    public void setCompanyDateCreate(Date companyDateCreate) {
        this.companyDateCreate = companyDateCreate;
    }

    

}
