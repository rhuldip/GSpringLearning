package com.rhuldip.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl2 implements ExampleService {

	public String exampleMethod(String src) {
		System.out.println("2.Service call Happening "+src);
		return "2: "+src;
	}

}
