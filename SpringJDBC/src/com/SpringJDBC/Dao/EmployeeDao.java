package com.SpringJDBC.Dao;

import java.util.List;

import com.SpringJDBC.pojo.Employee;

public interface EmployeeDao {
	
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeById(int employyeeid);
	public abstract void deleteEmployeeById(int employyeeid);
	public abstract void updateEmployeeEmailById(String newEmail, int employeeId);
	public abstract List<Employee> GetAllEmployeeDetail(); 
	

}
