package com.hexaware.restcrud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PolicyNotFoundException extends ResponseStatusException
{
	public PolicyNotFoundException(HttpStatus status, String msg) 
	{
		super(status,msg);
		
	}

}
