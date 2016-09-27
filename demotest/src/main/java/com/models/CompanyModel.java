package com.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("companybean")
@Scope("singleton")
public class CompanyModel {
	private String id;
	private String name;
	private EmployeeModel owner;
	private List<EmployeeModel> employees;
	
	@Autowired
	public CompanyModel(EmployeeModel emp){
		owner = emp;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeModel getOwner() {
		return owner;
	}
	public void setOwner(EmployeeModel owner) {
		this.owner = owner;
	}
	public List<EmployeeModel> getEmployees() {
		return employees;
	}
	public void setEmployees(List<EmployeeModel> employees) {
		this.employees = employees;
	}
}
