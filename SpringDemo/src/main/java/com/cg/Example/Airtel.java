package com.cg.Example;

public class Airtel {
	
	private Service service;

	
	public void setService(Service service) {
		this.service = service;
	}
	
	public void activateService() {
		System.out.println("service activating..");
		service.service();
		
	}

}
