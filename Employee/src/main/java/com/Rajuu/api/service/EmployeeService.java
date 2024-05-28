package com.Rajuu.api.service;

import com.Rajuu.api.entity.EmployeeEntity;

public interface EmployeeService {
		 public  EmployeeEntity createEmployee(EmployeeEntity employee);
		 
		 public EmployeeEntity getByEmployeeId(Long id);

	//	public boolean sendOTP(Long employeeId);
	}


