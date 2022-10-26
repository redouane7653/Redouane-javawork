package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Musician does not exist with that ID")
public class MusicianNotFoundException extends EntityNotFoundException{
	public MusicianNotFoundException() {}
	public MusicianNotFoundException(String msg) {
		super(msg);
	}

}
