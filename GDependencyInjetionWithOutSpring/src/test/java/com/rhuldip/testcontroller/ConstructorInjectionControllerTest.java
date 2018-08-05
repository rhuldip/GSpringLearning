package com.rhuldip.testcontroller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.rhuldip.controller.ConstructorInjectionController;
import com.rhuldip.service.ExampleServiceImpl;

public class ConstructorInjectionControllerTest {

	private ConstructorInjectionController cCtrl;
	
	@Before
	public void setUp() {
		this.cCtrl = new ConstructorInjectionController(new ExampleServiceImpl());
	}
	
	@Test
	public void testCase() {
		assertEquals("ConstructorInjection", this.cCtrl.callService());
	}
}
