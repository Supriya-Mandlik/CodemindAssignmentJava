package com.employee.dto;

public class EmployeeDto {
	
	private int id;
	private String name;
	private String email;
	private String department;
	private String position;
	private int salary;
	private String dateOfJoining;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDto(int id, String name, String email, String department, String position, int salary,
			String dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.position = position;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}
	
	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department
				+ ", position=" + position + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining + "]";
	}

}
