package com.Portifolio.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Portifolio.Model.entities.JobFunction;

@Repository
public interface JobFunctionRepository extends JpaRepository<JobFunction, Long> {
    
}
