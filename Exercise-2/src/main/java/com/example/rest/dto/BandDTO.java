package com.example.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.persistence.domain.Musician;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class BandDTO {

	private Long id;

	private String name;

	private List<Musician> musicians = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Musician> getMusicians() {
		return musicians;
	}

	public void setMusicians(List<Musician> musicians) {
		this.musicians = musicians;
	}

	@Override
	public String toString() {
		return "BandDTO [id=" + id + ", name=" + name + ", musicians=" + musicians + "]";
	}

	public BandDTO(Long id, String name, List<Musician> musicians) {
		super();
		this.id = id;
		this.name = name;
		this.musicians = musicians;

	}

	public BandDTO() {
		super();
	}

	
	}
	
	
