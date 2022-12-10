package com.Portifolio.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Portifolio.demo.Repository.CompanyEmployeeRepository;
import com.Portifolio.demo.entities.Company;


@SpringBootApplication
public class Serverinit implements CommandLineRunner {
    
    @Autowired
    Company company;
    public static void main(String[] args) {
		SpringApplication.run(Serverinit.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

    }
    
}
