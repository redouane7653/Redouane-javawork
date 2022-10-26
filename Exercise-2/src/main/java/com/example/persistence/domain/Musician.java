package com.example.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Musician {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 0, max = 55)
    private String name;

    @Min(0)
    @Max(12)
    private Integer strings;

    @NotNull
    private String type;

    @ManyToOne
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

	public Musician(Long id, @NotNull @Size(min = 0, max = 55) String name, @Min(0) @Max(12) Integer strings,
			@NotNull String type, Band band) {
		super();
		this.id = id;
		this.name = name;
		this.strings = strings;
		this.type = type;
		this.band = band;
	}

	public Musician() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Musician [id=" + id + ", name=" + name + ", strings=" + strings + ", type=" + type + ", band=" + band
				+ "]";
	}
    
	

}
