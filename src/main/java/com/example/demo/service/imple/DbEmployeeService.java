package com.example.demo.service.imple;
import com.example.demo.entity.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
@Service
public class DbEmployeeService implements EmployeeService{
   @Autowired
   EmployeeRepository employeeRepo;
	@Override
	public List<Employee> getEmployee() {
		return (List<Employee>) employeeRepo.findAll();
	}
    @Override
	public void addEmployee(Employee employee) {
    	employeeRepo.save(employee);
	}
    public void deleteEmployee(int id) {
    	employeeRepo.deleteById(id);
    }

}
