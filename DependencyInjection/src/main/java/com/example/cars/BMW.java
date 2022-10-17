package com.example.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.Car;
import com.example.interfaces.Engine;


	
@Component("BMW")// this generates BMW bean
public class BMW implements Car {

		
		@Autowired
		@Qualifier("V6")
		Engine eng;
		public String spec()
		{
			System.out.println("This car has "+eng.spec()+" Engine");
			return eng.spec();
		
	}
}