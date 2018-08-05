package com.rhuldip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rhuldip.service.ExampleService;

@Controller
public class PropertyInjectionController {

	@Autowired
	public ExampleService exampleServiceImpl;
	
	public String callService() {
		return this.exampleServiceImpl.exampleMethod("PropertyInjection");
	}
}
