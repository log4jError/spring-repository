package com.vishal.spring.service;

import org.springframework.stereotype.Service;

@Service
public class RemainderService 
{
	public double getRemainder(double number, double dividend)
	{
		double result;
		result = number/dividend;
		return result;
	}
}
