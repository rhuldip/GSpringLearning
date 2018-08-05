package com.rhuldip.controller;

import org.springframework.stereotype.Controller;

import com.rhuldip.service.ExampleService;

@Controller
public class ConstructorInjectionController {
	
	ExampleService exampleService;
	
	public ConstructorInjectionController(ExampleService exampleService){
		this.exampleService = exampleService;
	}
	
	public String callService() {
		return this.exampleService.exampleMethod("ConstructorInjection");
	}
}
