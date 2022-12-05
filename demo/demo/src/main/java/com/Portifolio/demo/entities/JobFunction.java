package com.Portifolio.demo.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobFunction {

    String jobFunctionName;

    Double salary;

    Date admissionDate;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    List<CompanyEmployee> compannyEmployees = new ArrayList<>();

    

    public JobFunction(String jobFunctionName, Double salary, Date admissionDate) {
        this.jobFunctionName = jobFunctionName;
        this.salary = salary;
        this.admissionDate = admissionDate;
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

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    




    
}
