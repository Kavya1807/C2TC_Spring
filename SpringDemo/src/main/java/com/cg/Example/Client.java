package com.cg.Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans file loaded");
		Airtel air = c.getBean("airtel",Airtel.class);
		air.activateService();
		
	}

}
