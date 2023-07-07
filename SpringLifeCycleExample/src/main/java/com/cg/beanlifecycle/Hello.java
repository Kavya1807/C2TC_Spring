package com.cg.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean,DisposableBean {

	
	  @Override public void afterPropertiesSet() throws Exception {
	  System.out.println("inside after property set method.  -->init");
	  
	  }
	 

	public void sample() {
		System.out.println("coding starts here...");
		
	}

	
	  @Override public void destroy() throws Exception {
	  System.out.println("inside destroy method.  -->destroy ");
	  
	  }
	  
	 

	
		/*
		 * public void init() {
		 * 
		 * System.out.println("\ninside hello class init method."); }
		 * 
		 * 
		 * 
		 * public void destroy() {
		 * 
		 * System.out.println("inside hello class destroy method.");
		 * 
		 * }
		 */
	 

}
