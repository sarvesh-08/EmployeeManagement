package com.example.spring.BootFourth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




//RESTful controller

@RestController

public class Controller {

	@RequestMapping(value="/helloWorld", method=RequestMethod.GET)
	public String sayHelloWorld() {
		return "Hello world , this is Spring boot application";
	}
}

