package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;

@org.springframework.web.bind.annotation.RestController
public class RestController
{
	@Autowired
	private EmployeeService  employeeService;
	
	@GetMapping("/")
	public String hello() {
		return "Hi Leila";
	}
	
	@GetMapping("/saveEmployee")
	public String SaveEmployee(@RequestParam String empno,@RequestParam String idno,@RequestParam String name,@RequestParam String family,@RequestParam String fathername,@RequestParam String pass)
	{
        Employee employee = new Employee(empno, idno, name, family, fathername, pass); 
        employeeService.SaveEmployee(employee);
        return "USer Saved";
	}
}

