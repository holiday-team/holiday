package com.hteam.holiday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hteam.holiday.activity.service.HelloWorld;

@Controller
public class HelloWorldController {
	@Autowired
	private HelloWorld helloWorldService;
	
	@RequestMapping("/helloWorld")
	public ModelAndView helloWorld(){
		System.out.println(helloWorldService);
		System.out.println("HelloWorld!");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("helloWorld");
		
		String greeting = helloWorldService.sayHello("liangrui");
		mav.addObject("greeting", greeting);
		return mav;
	}
	
}
