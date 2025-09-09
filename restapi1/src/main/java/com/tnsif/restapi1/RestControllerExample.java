package com.tnsif.restapi1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	
	@RequestMapping("/hello Coders")
	public String show()
	{
		return "Welcome to the TNSIF Capgemini CSR Spring Boot session";
	}
	
	@GetMapping("/hello")
    public String greetings(@RequestParam String name)
    {
    	return "Welcome "+name;
    }
	public String message(@PathVariable String name)
	{
		return "Welcome "+name;
	}
}
