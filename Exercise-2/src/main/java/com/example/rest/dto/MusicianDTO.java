package com.example.rest.dto;

import com.example.persistence.domain.Band;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class MusicianDTO {

	private Long id;

	private String name;

	private Integer strings;

	private String type;

	private Band band;

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

	public Integer getStrings() {
		return strings;
	}

	public void setStrings(Integer strings) {
		this.strings = strings;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Band getBand() {
		return band;
	}

	public void setBand(Band band) {
		this.band = band;
	}

	@Override
	public String toString() {
		return "MusicianDTO [id=" + id + ", name=" + name + ", strings=" + strings + ", type=" + type + ", band=" + band
				+ "]";
	}

	public MusicianDTO(Long id, String name, Integer strings, String type, Band band) {
		super();
		this.id = id;
		this.name = name;
		this.strings = strings;
		this.type = type;
		this.band = band;
	}

	public MusicianDTO() {
		super();
	}

}
