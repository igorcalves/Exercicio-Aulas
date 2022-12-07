package com.Portifolio.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class JobFunction {

    public JobFunction(){}
    String jobFunctionName;

    Double salary;

    Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    List<CompanyEmployee> compannyEmployees = new ArrayList<>();

    

    public JobFunction(String jobFunctionName, Double salary) {
        this.jobFunctionName = jobFunctionName;
        this.salary = salary;
    }

    public String getJobFunctionName() {
        return jobFunctionName;
    }

    public void setJobFunctionName(String jobFunctionName) {
        this.jobFunctionName = jobFunctionName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }



    




    
}
