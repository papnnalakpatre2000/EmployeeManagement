package com.example.ems.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@jakarta.persistence.Id
	private String Id;
	private String name;
	private String position;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
