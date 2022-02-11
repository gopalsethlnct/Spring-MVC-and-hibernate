package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")	
public class EmployeeController {	
	@Autowired
	private EmployeeService empService;
	@GetMapping("/getEmployee")
	public List<Employee> getEmployee() {
		return empService.getEmployee();
	}
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee emp) {
		empService.addEmployee(emp);
		return "success";
	}
	@DeleteMapping("/deleteEmployee")
	public String deleteEmployee(@PathParam("id") int id ) {
		empService.deleteEmployee(id);
		System.out.print("deleted");
		return "succes";
	}
	
	
	

}
