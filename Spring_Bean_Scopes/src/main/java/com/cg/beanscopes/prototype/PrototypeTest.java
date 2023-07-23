package com.cg.beanscopes.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Car.class);
		
	
        Car instance1 = ctx.getBean(Car.class);	
        System.out.println(instance1.getModel());
		System.out.println(instance1.hashCode());
		
	
		Car instance2 = ctx.getBean(Car.class);	
		System.out.println(instance2.getModel());
		System.out.println(instance2.hashCode());

	}
}