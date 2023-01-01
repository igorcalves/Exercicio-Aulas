package com.Portifolio.Model.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Portifolio.Model.Repository.JobFunctionRepository;
import com.Portifolio.Model.entities.JobFunction;

@RestController
@RequestMapping(value = "/Functions")
public class JobFunctionResource {
	
	@Autowired
	private JobFunctionRepository jbr;
	
	@GetMapping
	public ResponseEntity<List<JobFunction>> findAll(){
		
		List<JobFunction> jbList = jbr.findAll();
		return ResponseEntity.ok().body(jbList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<JobFunction> findById(@PathVariable Long id){
		JobFunction cE =jbr.findById(id).get();
		return ResponseEntity.ok().body(cE);
	}
	

}
