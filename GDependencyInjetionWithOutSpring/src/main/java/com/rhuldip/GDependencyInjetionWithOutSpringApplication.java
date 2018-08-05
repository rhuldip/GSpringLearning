package com.rhuldip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rhuldip.controller.ConstructorInjectionController;
import com.rhuldip.controller.PropertyInjectionController;
import com.rhuldip.controller.SetterInjectionController;

@SpringBootApplication
public class GDependencyInjetionWithOutSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(GDependencyInjetionWithOutSpringApplication.class, args);
		
		System.out.println("PropertyInjectionController = "+ctx.getBean(PropertyInjectionController.class).callService());
		//System.out.println("SetterInjectionController = "+ctx.getBean(SetterInjectionController.class).callService());
		System.out.println("ConstructorInjectionController = "+ctx.getBean(ConstructorInjectionController.class).callService());
		
	}
}
