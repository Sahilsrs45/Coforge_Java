package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	//handler mapper
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello....!";
		
		
	}
	@RequestMapping("/name")
	public String printName() {
		return "My name is sahil";
		
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome";
		
	}
	
	

}

