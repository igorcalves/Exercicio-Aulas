package com.Portifolio.Model.entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Company {
	
	
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    
    @Column(name = "Create_Date", columnDefinition = "DATE")
    private Date companyCreateDate;
    
    
    @OneToMany(mappedBy = "company")
    private List<CompanyEmployee> companyEmployees = new ArrayList<>();
    
    public Company() throws Exception{}

    public Company(String companyName, Date companyCreateDate) {
        this.companyName = companyName;
        this.companyCreateDate = companyCreateDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCompanyCreateDate() {
        return companyCreateDate;
    }

    public void setCompanyCreateDate(Date companyCreateDate) {
        this.companyCreateDate = companyCreateDate;
    }


    


}
