package com.coforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.coforge.bean.Laptop;
import com.coforge.bean.Manufacture;

@Configuration
@ComponentScan("com.coforge")
@PropertySource("classpath:info.properties")
public class SpringConfig {
/*	@Bean("lap")
	public Laptop getLaptop() {
		return new Laptop("dell",85201,"12gb","1tb","256gb","black",getManufactureInfo());
		
	}
	@Bean("man")
	public Manufacture getManufactureInfo() {
		return new Manufacture(4354,"xyz","Pune");
		
	}
*/
}
