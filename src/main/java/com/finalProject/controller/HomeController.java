package com.finalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Inside index.");
		return "index";
	}
	
	@RequestMapping("/registration")
	public String registration() {
		
		return "registrationPage";
		
	}

}
