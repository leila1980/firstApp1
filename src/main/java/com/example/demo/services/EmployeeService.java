package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	    private final EmployeeRepository employeeRepository;

	    
		public EmployeeService(EmployeeRepository employeeRepository) {
						this.employeeRepository = employeeRepository;
		}


		public void SaveEmployee(Employee employee) {
			employeeRepository.save(employee);
		}
}
