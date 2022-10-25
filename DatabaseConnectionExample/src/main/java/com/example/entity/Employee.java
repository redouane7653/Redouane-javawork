package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // maps Class with table
@Table(name = "Employee")
public class Employee {// by default the name of the table will also be employee
	private int id;
	private String name;
	private String email;
	private long phone;

	@Id // Create unique column, a primary Key
	//@GeneratedValue // use internal algorithm to generate primary key value
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "eid")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "fullname", nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "emailadress", unique=true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phonenumber")
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Employee(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

}
