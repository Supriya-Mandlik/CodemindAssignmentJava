package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto addEmployee(EmployeeDto employeeDto);
	
	List<EmployeeDto> getAllEmployees();
	
	EmployeeDto getEmployeeById(int id);
	
	EmployeeDto updateEmployee(EmployeeDto employeeDto , int id);
	
	void deleteEmployee(int id);
	
}
