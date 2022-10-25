package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class MainService {
	static List<String> list = new ArrayList<>();
	public MainService()
	{
		list.add("Shanghai");
		list.add("New York");
		list.add("London");
		list.add("Beijing");
		list.add("LA");
		
	}
	public List<String> show(){
		return list;
	}
	public List<String> create(){
		list.add("Instanbul");
		list.add("Dubai");
		return list;

	}
	public void update(int id) {
		list.set(id, "Delhi");
	}
	public void delete(int id) {
		list.remove(id);
	}
}
