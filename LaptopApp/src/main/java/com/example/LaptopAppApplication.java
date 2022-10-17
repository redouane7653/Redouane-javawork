package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.interfaces.Laptop;

@SpringBootApplication
public class LaptopAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LaptopAppApplication.class, args);
	
	  Laptop laptop1=context.getBean("Apple", Laptop.class);
	  Laptop laptop2=context.getBean("DELL", Laptop.class);

	  laptop1.spec();
	  laptop2.spec();

}
}