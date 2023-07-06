package com.cg.beanscope.mvc1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppllicationContextInitializer1 implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webapplicationcontext = new AnnotationConfigWebApplicationContext();
		webapplicationcontext.register(AppConfig1.class);

		// create a dispatcherServlet obj

		DispatcherServlet dispatcherServlet = new DispatcherServlet(webapplicationcontext);
		ServletRegistration.Dynamic mycustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet1",
				dispatcherServlet);
		
		mycustomDispatcherServlet.setLoadOnStartup(1);
		mycustomDispatcherServlet.addMapping("/application1/*");
		
		

	}

}
