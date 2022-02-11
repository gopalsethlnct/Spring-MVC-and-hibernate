package com.example.demo.service;
import com.example.demo.entity.Employee;

import java.util.*;


public interface EmployeeService {

	public List<Employee> getEmployee();

	public void addEmployee(Employee emp);
	public void deleteEmployee(int id);

}
