package com.Portifolio.Model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class JobFunction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobFunctionName;
    
    @Column(name="Salary", columnDefinition="Decimal(10,2) default '0.00'")
    private Double salary;

     @OneToMany(mappedBy = "jobFunction")
     private List<CompanyEmployee> companyEmployee;
     

    public JobFunction(){}

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
