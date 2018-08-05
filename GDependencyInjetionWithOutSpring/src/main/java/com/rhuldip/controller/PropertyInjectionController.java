package com.rhuldip.controller;

import com.rhuldip.service.ExampleServiceImpl;

public class PropertyInjectionController {

	public ExampleServiceImpl exampleService;
	
	public String callService() {
		return this.exampleService.exampleMethod("PropertyInjection");
	}
}
