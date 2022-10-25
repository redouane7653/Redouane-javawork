package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MainService;

@RestController// responsible for routing user request to expose data 
public class MainController {// simple java class
	@Autowired
	MainService service;
//	List<String> list = new ArrayList<>();

//	public MainController() {
//
//		list.add("Shanghai");
//		list.add("New York");
//		list.add("London");
//		list.add("Beijing");
//		list.add("LA");
//	}

//GET Method
	@GetMapping("/list")
	public List<String> showList() {
		return this.service.show();
	}

//POST add to the list
	@PostMapping("/add")
	public List<String> addToList() {
//		list.add("Instanbul");
//		list.add("Dubai");
		return this.service.create();

	}

	// PUT updates the list 
	@PutMapping("/update/{id}")
	public void updateTheList(@PathVariable int id)
	{
		this.service.update(id);
//		list.set(id, "Delhi");		
	//  list.replace()
	}
	// DELETE deletes a record
	@DeleteMapping("/delete/{id}")
	public void deleteFromTheList(@PathVariable int id)
	{
//		list.remove(id);
		this.service.delete(id);
	}
}
