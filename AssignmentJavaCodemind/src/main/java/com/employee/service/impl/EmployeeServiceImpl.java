package com.employee.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;
import com.employee.mapper.EmployeeMapper;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto addEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		return employees.stream().map((employee)->EmployeeMapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
	}

	@Override
	public EmployeeDto getEmployeeById(int id) {
		Employee employee = employeeRepository
				.findById(id)
				.orElseThrow(()->new RuntimeException("Employee Does Not Exist"));
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto employeeDto, int id) {
		Employee employee = employeeRepository
				.findById(id)
				.orElseThrow(()->new RuntimeException("Employee Does Not Exist"));
		Employee employee2 = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee2 = employeeRepository.save(employee2);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee2);
	}

	@Override
	public void deleteEmployee(int id) {
		Employee employee = employeeRepository
				.findById(id)
				.orElseThrow(()->new RuntimeException("Employee Does Not Exist"));
		employeeRepository.deleteById(id);	
	}

}
