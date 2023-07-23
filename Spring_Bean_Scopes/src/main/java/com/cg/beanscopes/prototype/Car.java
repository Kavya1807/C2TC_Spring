package com.cg.beanscopes.prototype;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Car {

	private String model = "Lamborghini";

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}