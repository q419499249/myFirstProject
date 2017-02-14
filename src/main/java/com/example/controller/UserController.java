package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@GetMapping(value="/vin/say")
	public String say(@PathVariable String vin){
		return vin;
	}

}
