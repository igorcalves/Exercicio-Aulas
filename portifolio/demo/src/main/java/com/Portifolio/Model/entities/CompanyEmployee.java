package com.Portifolio.Model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class CompanyEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeName;
    
    @Column(name = "BirthDay", columnDefinition = "DATE")
    private Date birthDay;
    
    private String cpf;
    
    private String email;
    
    @ManyToOne
    private Company company;
        

     @ManyToOne(fetch = FetchType.LAZY)
     private JobFunction jobFunction;
     
  
     private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    


    public CompanyEmployee() {}
    
    public CompanyEmployee(String employeeName, Date birthDay, String cpf, String email,
    JobFunction jobFunction,Company company) {
        this.employeeName = employeeName;
        this.birthDay = birthDay;
        this.cpf = cpf;
        this.email = email;
        this.jobFunction = jobFunction;
        this.company = company;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getBirthDay() throws Exception {
        return sdf.format(birthDay);
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

	public Long getId() {
		return id;
	}

	public String getJobFunction() {
		return jobFunction.getJobFunctionName();
	}
	
	public Double getSalary() {
		return jobFunction.getSalary();
	}
	
	public String getCompany() {
		return company.getCompanyName();
	}
	
	


    

}
