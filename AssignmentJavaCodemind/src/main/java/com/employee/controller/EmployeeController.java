package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDto;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employeeDto){
		return new ResponseEntity<>(employeeService.addEmployee(employeeDto),HttpStatus.CREATED);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
		List<EmployeeDto> allEmployees = employeeService.getAllEmployees();
		return ResponseEntity.ok(allEmployees);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable int id){
		EmployeeDto employeeById = employeeService.getEmployeeById(id);
		return ResponseEntity.ok(employeeById);
	}
	
	@PutMapping("/employee/{id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto,@PathVariable int id){
		EmployeeDto updateEmployee = employeeService.updateEmployee(employeeDto, id);
		return ResponseEntity.ok().body(updateEmployee);
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id){
		employeeService.deleteEmployee(id);
		return ResponseEntity.ok("Employee is deleted Successfully!");
	}

}
