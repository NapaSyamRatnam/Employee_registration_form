package com.Rajuu.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rajuu.api.entity.EmployeeEntity;
import com.Rajuu.api.service.EmployeeService;

@RestController
	public class EmployeeController {
		@Autowired
		private EmployeeService empservice;
		@PostMapping("/create")
		public ResponseEntity<EmployeeEntity>  createEmployee(EmployeeEntity employee){
			
			EmployeeEntity employee2 = empservice.createEmployee(employee);
			if(employee2==null)  {
			
		return new ResponseEntity<EmployeeEntity>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<EmployeeEntity>(HttpStatus.CREATED); 
		}
		@GetMapping("/getById/{id}")
		 public ResponseEntity<EmployeeEntity>  getByEmployeeId(@PathVariable Long id) {
		
			EmployeeEntity getbyId = empservice.getByEmployeeId(id);
			if(getbyId == null) {
				return ResponseEntity.notFound().build();			
			}
			return ResponseEntity.ok(getbyId);  
		}

	}
	

