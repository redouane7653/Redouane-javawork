package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Band does not exist with that ID")
public class BandNotFoundException extends EntityNotFoundException{
	public BandNotFoundException() {}
	public BandNotFoundException(String msg) {
		super(msg);
	}

}
