package com.Portifolio.demo.entities.Data;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;

import com.Portifolio.demo.Repository.CompanyEmployeeRepository;
import com.Portifolio.demo.Repository.CompanyRepository;
import com.Portifolio.demo.Repository.JobFunctionRepository;
import com.Portifolio.demo.entities.Company;
import com.Portifolio.demo.entities.CompanyEmployee;
import com.Portifolio.demo.entities.JobFunction;

public class CD {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static DecimalFormat df = new DecimalFormat("0.000");
/*
 * 
 @Autowired
 CompanyRepository companyRepository;
 
 @Autowired
 CompanyEmployeeRepository companyEmployeeRepository;
 
 @Autowired
 JobFunctionRepository jobFunctionRepository;
 */
    

    Company company = new Company("AllSafe");
    
   



    public Company getCompany() {
        return company;
    }

    public static void atomicCreate(String name, String birthDay,String cpf,String email,
    String jbname, Double jbSalary,Company company) 
    throws Exception{
        JobFunction jobFunction = new JobFunction(jbname, jbSalary);
        CompanyEmployee companyEmployee = new CompanyEmployee(name, sdf.parse(birthDay), cpf, email, jobFunction, company);
        
        company.getCompanyEmployees().add(companyEmployee);

        company.getCompanyJobFunctions().add(jobFunction);
        /*
        companyRepository.save(this.company);
        
        companyEmployeeRepository.save(companyEmployee);
        
        jobFunctionRepository.save(jobFunction);
        */
         
    }

    public void showall(){
        for(CompanyEmployee c: company.getCompanyEmployees()){
            System.out.println("Empresa: " + company.getCompanyName() + 
            "\nO funcinario: " + c.getName() + 
            "\nNasceu: "+ sdf.format(c.getBirthDate()) + 
            "\nEmail: " + c.getEmail() +
            "\ntem o salario de: " + df.format(c.getJobFunction().getSalary()) + 
            "\nCargo: " + c.getJobFunction().getJobFunctionName() + "\n");

        }
    }

    public void cdata()throws Exception{
        DataGenerated dg = new DataGenerated();
        dg.data(company);
        dg.datacr();

       
    }
    
}
