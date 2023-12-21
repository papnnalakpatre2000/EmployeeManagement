package com.example.ems.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.bean.Employee;
import com.example.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository employeeRepository;
	public List<Employee> getAllEmployee(){
		List<Employee> allemp= new ArrayList<>();
		 employeeRepository.findAll().forEach(allemp::add);
		 return allemp;
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(String id,Employee employee) {
		
		employeeRepository.save(employee);
	}
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}

}
