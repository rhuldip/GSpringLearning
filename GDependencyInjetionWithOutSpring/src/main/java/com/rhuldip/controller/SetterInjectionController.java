package com.rhuldip.controller;

import com.rhuldip.service.ExampleServiceImpl;

public class SetterInjectionController {
	
	ExampleServiceImpl exampleService;
	
	public void setExampleService(ExampleServiceImpl exampleService) {
		this.exampleService = exampleService;
	}
	
	public String callService() {
		return this.exampleService.exampleMethod("SetterInjection");
	}
}
