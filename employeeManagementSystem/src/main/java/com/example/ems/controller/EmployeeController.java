package com.example.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.bean.Employee;
import com.example.ems.services.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	
	@GetMapping("/allemployee")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	@PostMapping("/addemployee")
	public void addEmployee(@RequestBody Employee employee ) {
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employees/{id}")
	public void updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
		employeeService.updateEmployee(id,employee);
	}
	@DeleteMapping("demployee/{id}")
	public void deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
	}

}
