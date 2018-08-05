package com.rhuldip.testcontroller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.rhuldip.controller.SetterInjectionController;
import com.rhuldip.service.ExampleServiceImpl;

public class SetterInjectionControllerTest {
	
	private SetterInjectionController sCtrl;
	
	@Before
	public void setUp() {
		sCtrl = new SetterInjectionController();
		sCtrl.setExampleService(new ExampleServiceImpl());
	}
	
	@Test
	public void testCase() {
		assertEquals("SetterInjection", this.sCtrl.callService());
	}
	
}
