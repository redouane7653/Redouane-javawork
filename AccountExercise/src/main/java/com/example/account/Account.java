package com.example.account;

import org.springframework.stereotype.Service;


public class Account {

private String accountNumber;
private long id;
private String name;
public String getAccountNumber() {
	return accountNumber;
	
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
	
	
}
public Account(String accountNumber, long id, String name) {
	super();
	this.accountNumber = accountNumber;
	this.id = id;
	this.name = name;
	
	
	
}
public Account() {
	super();
}

	
}
