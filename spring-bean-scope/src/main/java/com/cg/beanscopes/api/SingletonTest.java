package com.cg.beanscopes.api;

import org.springframework.stereotype.Component;

@Component
public class SingletonTest {
	
	private int n=0;
	
	public SingletonTest() {
		System.out.println(" SingletonTest constr");
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	
}
