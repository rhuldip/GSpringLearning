package com.rhuldip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rhuldip.controller.ConstructorInjectionController;

@SpringBootApplication
public class GDependencyInjetionWithOutSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GDependencyInjetionWithOutSpringApplication.class, args);
		System.out.println(ctx.getBean(ConstructorInjectionController.class).callService());
	}
}
