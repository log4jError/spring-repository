package com.vishal.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException 
	{
		AnnotationConfigWebApplicationContext context= new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class, WebConfig.class);
		context.setServletContext(container);
		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(context));
		dispatcher.addMapping("/");
		dispatcher.setLoadOnStartup(1);
	}
}
