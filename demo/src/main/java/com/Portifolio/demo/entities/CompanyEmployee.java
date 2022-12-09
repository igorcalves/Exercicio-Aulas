package com.Portifolio.demo.entities;


import java.util.Date;

public class CompanyEmployee {


    String name;

    Date birthDate = new Date();

    String cpf;

    String email;

    JobFunction jobFunction = new JobFunction();

    Company company;


    public CompanyEmployee(String name, Date birthDate, String cpf, String email, JobFunction jobFunction,Company company) {
        this.name = name;
        this.birthDate = birthDate;
        this.cpf = cpf;
        this.email = email;
        this.jobFunction = jobFunction;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public JobFunction getJobFunction() {
        return jobFunction;
    }

    public void setJobFunction(JobFunction jobFunction) {
        this.jobFunction = jobFunction;
    }

    public Company getCompany() {
        return company;
    }

  


    
    
    
}
