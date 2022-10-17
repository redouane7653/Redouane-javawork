package com.example.storages;

import org.springframework.stereotype.Component;

import com.example.interfaces.Storage;

@Component("512")
public  class HDD512 implements Storage{
	public String spec()
	{
		return "512";
	}

}
