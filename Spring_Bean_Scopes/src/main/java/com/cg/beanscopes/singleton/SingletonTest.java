package com.cg.beanscopes.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SingletonBeanClass.class);
		
		//Singleton 
		SingletonBeanClass instance1 = ctx.getBean(SingletonBeanClass.class);		
		System.out.println(instance1.hashCode());
		
	
		SingletonBeanClass instance2 = ctx.getBean(SingletonBeanClass.class);		
		System.out.println(instance2.hashCode());

	}
}