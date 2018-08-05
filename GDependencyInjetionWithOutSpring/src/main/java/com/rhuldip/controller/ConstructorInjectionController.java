package com.rhuldip.controller;

import com.rhuldip.service.ExampleServiceImpl;

public class ConstructorInjectionController {
	
	ExampleServiceImpl exampleService;
	
	public ConstructorInjectionController(ExampleServiceImpl exampleService){
		this.exampleService = exampleService;
	}
	
	public String callService() {
		return this.exampleService.exampleMethod("ConstructorInjection");
	}
}
