package com.rhuldip.testcontroller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.rhuldip.controller.PropertyInjectionController;
import com.rhuldip.service.ExampleServiceImpl;

public class PropertyInjectionControllerTest {

	private PropertyInjectionController pCtrl;
	
	@Before
	public void setUp() {
		this.pCtrl = new PropertyInjectionController();
		this.pCtrl.exampleServiceImpl = new ExampleServiceImpl();
	}
	
	@Test
	public void testCase() {
		assertEquals("PropertyInjection", this.pCtrl.callService() );
	}
	
}
