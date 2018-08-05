package com.rhuldip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.rhuldip.service.ExampleService;

@Controller
public class SetterInjectionController {
	
	@Autowired
	@Qualifier("exampleServiceImpl2")
	ExampleService exampleService;
	
	public void setExampleService(ExampleService exampleService) {
		this.exampleService = exampleService;
	}
	
	public String callService() {
		return this.exampleService.exampleMethod("SetterInjection");
	}
}
