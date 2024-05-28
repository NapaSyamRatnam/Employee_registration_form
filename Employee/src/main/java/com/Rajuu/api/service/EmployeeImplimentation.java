package com.Rajuu.api.service;



	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.Rajuu.api.entity.EmployeeEntity;
import com.Rajuu.api.repository.EmployeeRepository;

	

	@Service
	public class EmployeeImplimentation implements EmployeeService {
		@Autowired
		private EmployeeRepository employeeRepo;

		@Override
		public EmployeeEntity createEmployee(EmployeeEntity employee) {
			if(employee != null)
			{
			EmployeeEntity save = employeeRepo.save(employee);
			return save;
			}	
			return null;
		}

		@Override
		public EmployeeEntity getByEmployeeId(Long id) {
			if(id != null)
			{
			 Optional<EmployeeEntity> findById = employeeRepo.findById(id);
			         if(findById.isEmpty())
			         {
			        	 return null;
			         }
			         return findById.get();
			}
			return null;
		}

//		@Override
//		public boolean sendOTP(Long employeeId) {
//			
//			return false;
//		}
	}


