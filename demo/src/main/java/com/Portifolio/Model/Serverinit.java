package com.Portifolio.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Portifolio.Model.Repository.CompanyEmployeeRepository;
import com.Portifolio.Model.Repository.CompanyRepository;
import com.Portifolio.Model.Repository.JobFunctionRepository;
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

    @Override
    public void run(String... args) throws Exception {

        DataGenerated dg = new DataGenerated();

        dg.uploadRandomDate();
        
        companyRepository.save(dg.getCompany());
        for (int i = 0; i < 20; i++) {
            jobFunctionRepository.save(dg.getJobFunction());
            companyEmployeeRepository.save(dg.getCompanyEmployee());
            
            dg.uploadRandomDate();
        }

    }
    
}
