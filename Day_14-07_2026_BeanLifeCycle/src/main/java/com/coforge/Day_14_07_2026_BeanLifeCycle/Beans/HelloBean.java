package com.coforge.Day_14_07_2026_BeanLifeCycle.Beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("hello")
public class HelloBean {
	
	public HelloBean() {
		System.out.println("1.HelloBean contructor called");
	}
	
	
	
	@PostConstruct
	public void init() {
		System.out.println("2.@Post construct init method");
		
	}
	
	
	
	
	public void sayHello() {
		System.out.println("3.Hello");
		
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("4.@PreDestroy destroy is called");
		
	}

}
