package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	int id;
	String street, city, state;
	int pincode;
	int addressType;
//	@OneToOne(mappedBy = "address")
//	Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Employee getEmployee() {
//		return employee;
//	}

//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, String state, int pincode, int addressType) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.addressType = addressType;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getAddressType() {
		return addressType;
	}

	public void setAddressType(int addressType) {
		this.addressType = addressType;
	}
}
