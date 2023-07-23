package com.cg.beanscopes.api;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component("myBean")

@Scope(value = WebApplicationContext.SCOPE_SESSION ,proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope(value = WebApplicationContext.SCOPE_REQUEST ,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MyBean {

	String name = "Kavya";

	public MyBean() {
		System.out.println("My Bean Object created...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
