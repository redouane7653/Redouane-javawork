package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.mybeans.Book;
import com.example.mybeans.Person;

@Configuration
public class AppConfig {
	
	
	 @Bean
	 @Scope("prototype")
		public Person showPerson() {
		 return new Person("Upasana", 32);
	 }
		 
		 
		 @Bean
		 @Scope("prototype")
		 public Book showBook() {	
		return new Book(101, "Tell me your dreams", 121, "Sidney Sheldon", 5);

			 
		 }
}
	 


