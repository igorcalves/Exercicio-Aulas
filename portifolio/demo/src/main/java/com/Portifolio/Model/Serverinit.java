package com.Portifolio.Model;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Portifolio.Model.Repository.CompanyEmployeeRepository;
import com.Portifolio.Model.Repository.CompanyRepository;
import com.Portifolio.Model.Repository.JobFunctionRepository;
import com.Portifolio.Model.entities.Company;
import com.Portifolio.Model.entities.Data.DataGenerated;




@SpringBootApplication
public class Serverinit implements CommandLineRunner {

    @Autowired
    private CompanyRepository companyRepository;
 
    @Autowired
    private CompanyEmployeeRepository companyEmployeeRepository;
 
    @Autowired
    private JobFunctionRepository jobFunctionRepository;
    
    
    public static void main(String[] args) {
		SpringApplication.run(Serverinit.class, args);
	}

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public void run(String... args) throws Exception {
    	
    	
        DataGenerated dg = new DataGenerated();
        dg.setCompany(new Company("allSafe",sdf.parse("26/12/1997")));
        companyRepository.save(dg.getCompany());
        
       dg.CreateJobFunction();
       jobFunctionRepository.save(dg.getJ1());
       jobFunctionRepository.save(dg.getJ2());
       jobFunctionRepository.save(dg.getJ3());
       jobFunctionRepository.save(dg.getJ4());
        
        
        for (int i = 0; i < 2000; i++) {
        	dg.uploadRandomDate();
        	companyEmployeeRepository.save(dg.getCompanyEmployee());
//        	jobFunctionRepository.save(dg.getJobFunction());
            
        }

    }
    
}
