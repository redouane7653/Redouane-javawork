package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.mybeans.Book;
//import com.example.mybeans.Person;

@SpringBootApplication
public class MyFirstSpringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MyFirstSpringApplication.class, args);
		ApplicationContext context = SpringApplication.run(MyFirstSpringApplication.class, args);

//		Object byName = context.getBean("greeting");
//		String byType = context.getBean(String.class);
//		String byBoth = context.getBean("greeting", String.class);
		
//		Object byName = context.getBean("showPerson");
//		Person byType = context.getBean(Person.class);
//		Person byBoth = context.getBean("showPerson", Person.class);
//		
//		System.out.println(byName);
//		System.out.println(byType);
//		System.out.println(byBoth);
		
		
		Object byName = context.getBean("showBook");
		Book byType = context.getBean(Book.class);
		Book byBoth = context.getBean("showBook", Book.class);

		System.out.println(byName);
		System.out.println(byType);
		System.out.println(byBoth);

	}

//	@Bean
//	public String greeting() {
//		return "Hello, World";
	}


