package com.Portifolio.demo.entities.Data;

import java.text.SimpleDateFormat;

import com.Portifolio.demo.entities.Company;
import com.Portifolio.demo.entities.CompanyEmployee;
import com.Portifolio.demo.entities.JobFunction;

public class CD {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Company company = new Company();
    



    public void supremeCreate(String name, String birthDay,String cpf,String email,
    String jbname, Double jbSalary) 
    throws Exception{
        JobFunction jobFunction = new JobFunction(jbname, jbSalary);
        CompanyEmployee companyEmployee = new CompanyEmployee(name, sdf.parse(birthDay), cpf, email, jobFunction);

        company.getCompanyEmployees().add(companyEmployee);
        company.getCompanyJobFunctions().add(jobFunction);
    }

    public void showall(){
        for(CompanyEmployee c: company.getCompanyEmployees()){
            System.out.println(c.getJobFunction().getSalary());

        }
    }
    
}
