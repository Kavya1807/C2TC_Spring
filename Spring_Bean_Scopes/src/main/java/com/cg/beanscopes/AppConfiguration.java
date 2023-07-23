package com.cg.beanscopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cg.beanscopes.prototype.Car;
import com.cg.beanscopes.singleton.SingletonBeanClass;

@Configuration
public class AppConfiguration {


	@Bean  
	//@Scope("singleton") This statement is redundant - singleton is default scope
	public  SingletonBeanClass  methodbean(){
		
		return new SingletonBeanClass();
	}
	
	@Bean
	@Scope("prototype")
	public Car car() {
	    return new Car();
	}
}