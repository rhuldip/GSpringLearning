package com.rhuldip.service;

public class ExampleServiceImpl implements ExampleService {

	public String exampleMethod(String src) {
		System.out.println("Service call Happening"+src);
		return src;
	}

}
