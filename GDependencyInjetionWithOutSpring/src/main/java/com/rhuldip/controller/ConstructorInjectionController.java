package com.rhuldip.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.rhuldip.service.ExampleService;
import com.rhuldip.service.ExampleServiceImpl;

@Controller
public class ConstructorInjectionController {
	
	ExampleService exampleService;
	
	public ConstructorInjectionController(@Qualifier("exampleServiceImpl2")ExampleService exampleService){
		this.exampleService = exampleService;
	}
	
	public String callService() {
		return this.exampleService.exampleMethod("ConstructorInjection");
	}
}
