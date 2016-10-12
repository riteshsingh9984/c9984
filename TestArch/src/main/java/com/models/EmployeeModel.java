package com.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employeebean")
@Scope("singleton")
public class EmployeeModel {

	private Long id;
	private String name;
	private String salary;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
