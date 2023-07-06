package com.cg.beanscopes.api;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_APPLICATION,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ApplicationScopeTest {
	
	private int n=0;
	
	public ApplicationScopeTest() {
		System.out.println(" ApplicationScopeTest constr");
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}

}
