package com.coforge;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.beans.Department;
import com.coforge.config.AppConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//        
//        Department d=(Department) context.getBean("dept");
//        
//        System.out.println(d)

    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	Department d=(Department) context.getBean(Department.class);
    	
    	System.out.println(d);
    }
}
