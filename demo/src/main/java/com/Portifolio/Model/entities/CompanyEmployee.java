package com.Portifolio.Model.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class CompanyEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeName;
    
    private Date birthDay;
    
    private String cpf;
    
    private String email;
    
           
     @OneToOne
     private JobFunction jobFunction;
     
    
     @OneToOne
     private Company company;

    
    


    public CompanyEmployee() {}
    
    public CompanyEmployee(String employeeName, Date birthDay, String cpf, String email,
    JobFunction jobFunction) {
        this.employeeName = employeeName;
        this.birthDay = birthDay;
        this.cpf = cpf;
        this.email = email;
        //this.jobFunction = jobFunction;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
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


    

}
