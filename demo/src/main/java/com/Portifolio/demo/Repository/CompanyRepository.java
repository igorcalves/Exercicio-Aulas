package com.Portifolio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Portifolio.demo.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long>{
    
}
