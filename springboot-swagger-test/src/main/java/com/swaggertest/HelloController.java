package com.swaggertest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/swaggerapi")
	public String sayHello() {
		return "Swagger Hello World Application";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/api/swaggerapipost")
	public String sayHello1() {
		return "Swagger Hello World Application";
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/api/swaggerapiput")
	public String sayHello2() {
		return "Swagger Hello World Application";
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/swaggerapidelete")
	public String sayHello3() {
		return "Swagger Hello World Application";
	}
}
