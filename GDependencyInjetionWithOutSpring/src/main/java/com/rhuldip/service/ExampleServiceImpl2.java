package com.rhuldip.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("two")
public class ExampleServiceImpl2 implements ExampleService{

	public String exampleMethod(String src) {
		System.out.println("2: Service call Happening "+src);
		return "2: "+ src;
	}
	
}
