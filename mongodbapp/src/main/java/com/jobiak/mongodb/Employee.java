package com.jobiak.mongodb;

import org.springframework.data.annotation.Id;

public class Employee {
	@Id
	String id;
	String name;
	String location;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	

}
