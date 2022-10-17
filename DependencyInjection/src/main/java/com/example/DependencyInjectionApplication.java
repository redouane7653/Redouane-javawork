package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.cars.Audi;
import com.example.cars.BMW;
//import com.example.cars.Engine;

import com.example.interfaces.Car;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		Car car1=context.getBean("Audi", Car.class);
		Car car2=context.getBean("BMW", Car.class);
		
		
		car1.spec();
		car2.spec();


	}

}
