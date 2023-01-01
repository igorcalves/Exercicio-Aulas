package com.Portifolio.Model.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Portifolio.Model.Repository.CompanyEmployeeRepository;
import com.Portifolio.Model.entities.CompanyEmployee;

@RestController
@RequestMapping(value = "/CompanyEmployee")
public class CompanyEmployeeResource {


	@Autowired
	CompanyEmployeeRepository cER;
	
	
	@GetMapping
	public ResponseEntity<List<CompanyEmployee>> findAll(){
		List<CompanyEmployee> cEList= cER.findAll();
		return ResponseEntity.ok().body(cEList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CompanyEmployee> findById(@PathVariable Long id){
		CompanyEmployee cE = cER.findById(id).get();
		return ResponseEntity.ok().body(cE);
	}
	
	
	
	
	}
