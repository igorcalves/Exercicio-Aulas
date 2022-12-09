package com.Portifolio.demo.entities.Data;

import java.text.SimpleDateFormat;

import com.Portifolio.demo.entities.Company;
import com.Portifolio.demo.entities.CompanyEmployee;
import com.Portifolio.demo.entities.JobFunction;

public class CD {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    Company company = new Company("AllSafe");
    



    public Company getCompany() {
        return company;
    }

    public void atomicCreate(String name, String birthDay,String cpf,String email,
    String jbname, Double jbSalary,Company company) 
    throws Exception{
        JobFunction jobFunction = new JobFunction(jbname, jbSalary);
        CompanyEmployee companyEmployee = new CompanyEmployee(name, sdf.parse(birthDay), cpf, email, jobFunction, company);

        company.getCompanyEmployees().add(companyEmployee);
        company.getCompanyJobFunctions().add(jobFunction);
    }

    public void showall(){
        for(CompanyEmployee c: company.getCompanyEmployees()){
            System.out.println("Empresa: " + company.getCompanyName() + 
            "\nO funcinario: " + c.getName() + 
            "\nNasceu: "+ c.getBirthDate() + 
            "\nEmail: " + c.getEmail() +
            "\ntem o salario de: " + c.getJobFunction().getSalary() + 
            "\nCargo: " + c.getJobFunction().getJobFunctionName() + "\n");

        }
    }

    public void data() throws Exception{
        CD cd = new CD();
        cd.atomicCreate("igor Alves", "26/12/1997", 
        "47716544865", "igor193@live.com", "CEO", 15000.00, company);

        cd.atomicCreate("iago pereira", "26/12/1996", 
        "47716544865", "iago@live.com", "CO-CEO", 15000.00,company);

        cd.atomicCreate("Luciana Maria", "26/12/1970", 
        "47716544865", "luciana@live.com", "CEO Master", 30000.00,company);

       
    }
    
}
