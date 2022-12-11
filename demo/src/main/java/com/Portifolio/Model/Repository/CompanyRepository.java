package com.Portifolio.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Portifolio.Model.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long>{
    
}
