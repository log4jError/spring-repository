package com.vishal.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArithmeticController 
{
	@RequestMapping(value="/remainder", method=RequestMethod.POST)
	public ModelAndView getRemainder(@RequestParam(name="num") double number, @RequestParam(name="div")double dividend)
	{
		// method that will return the double remainder to user page
		ModelAndView mav = new ModelAndView();
		double result = number % dividend;
		mav.addObject("result", result);
		mav.setViewName("index");
		return mav;
	}
}
