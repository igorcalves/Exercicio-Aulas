package com.Portifolio.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Portifolio.Model.entities.CompanyEmployee;

@Repository
public interface CompanyEmployeeRepository extends JpaRepository<CompanyEmployee,Long>{
    
}
