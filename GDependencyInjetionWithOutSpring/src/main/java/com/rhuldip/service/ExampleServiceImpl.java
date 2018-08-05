package com.rhuldip.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@Primary
@Profile("one")
public class ExampleServiceImpl implements ExampleService {

	public String exampleMethod(String src) {
		System.out.println("1: Service call Happening "+src);
		return "1: "+ src;
	}

}
