package com.cg.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("Configuration loaded...");

		Sim sim = c.getBean("sim", Sim.class);

		sim.call();

		sim.data();

	}

}
