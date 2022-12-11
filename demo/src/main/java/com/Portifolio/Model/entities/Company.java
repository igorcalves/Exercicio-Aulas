package com.Portifolio.Model.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Company {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    
    private Date companyCreateDate;
    
    @Transient
    CompanyEmployee companyEmployee;
    
    public Company(){}

    public Company(String companyName, Date companyCreateDate,CompanyEmployee companyEmployee) {
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
