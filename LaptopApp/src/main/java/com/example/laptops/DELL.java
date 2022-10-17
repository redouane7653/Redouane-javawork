package com.example.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.Laptop;
import com.example.interfaces.Storage;

@Component("DELL")
public class DELL implements Laptop {
	@Autowired
	@Qualifier("512")
	Storage sto;
	
public String spec() {
	System.out.println("This laptop has " + sto.spec()+ "  Storage");
	return sto.spec();
}
	
}
