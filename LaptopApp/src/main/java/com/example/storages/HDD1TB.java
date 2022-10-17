package com.example.storages;

import org.springframework.stereotype.Component;

import com.example.interfaces.Storage;

@Component("1TB")
public  class HDD1TB implements Storage {
	public String spec()
	{
		return "1TB";
	}

}
