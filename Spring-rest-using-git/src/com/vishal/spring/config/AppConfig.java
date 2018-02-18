package com.vishal.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.vishal.spring.controller.ArithmeticController;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="{com.vishal.spring}")
public class AppConfig 
{
	@Bean
	public ArithmeticController arithmeticController()
	{
		return new ArithmeticController();
	}
}
