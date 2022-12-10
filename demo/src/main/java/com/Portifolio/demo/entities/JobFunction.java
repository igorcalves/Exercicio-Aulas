package com.Portifolio.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "TB_JOB_FUNCTION")
public class JobFunction {

    public JobFunction(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobFunctionName;

    private Double salary;

    @ManyToOne
    @JoinColumn(name = "JOB_func_company_id")
    private Company company;

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
