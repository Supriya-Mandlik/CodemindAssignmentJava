package com.employee.mapper;

import com.employee.dto.EmployeeDto;
import com.employee.entity.Employee;

public class EmployeeMapper {
	
public static Employee mapToEmployee(EmployeeDto employeeDto) {
	
	Employee employee = new Employee(
			employeeDto.getId(),
			employeeDto.getName(),
			employeeDto.getEmail(),
			employeeDto.getDepartment(),
			employeeDto.getPosition(),
			employeeDto.getSalary(),
			employeeDto.getDateOfJoining()
			);
	return employee;
	
}

public static EmployeeDto mapToEmployeeDto(Employee employee) {
	
	EmployeeDto employeeDto = new EmployeeDto(
			employee.getId(),
			employee.getName(),
			employee.getEmail(),
			employee.getDepartment(),
			employee.getPosition(),
			employee.getSalary(),
			employee.getDateOfJoining()
			);
	return employeeDto;
}

}

