package com.Portifolio.Model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class JobFunction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobFunctionName;

    private Double salary;

    
     @Transient
     private CompanyEmployee companyEmployee;
     

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
