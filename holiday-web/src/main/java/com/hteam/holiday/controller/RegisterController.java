package com.hteam.holiday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.hteam.holiday.user.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService ;
	
	public ModelAndView register(){
		ModelAndView model = new ModelAndView();
		
		return model;
	}
	
}
