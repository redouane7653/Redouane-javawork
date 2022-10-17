package com.example.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.Laptop;
import com.example.interfaces.Storage;

@Component("Apple")
public class Apple implements Laptop {
	@Autowired
	@Qualifier("1TB")
	Storage sto;

public String spec()
{
	System.out.println("This computer has "+ sto.spec()+ "Storage");
	return sto.spec();
}

}
