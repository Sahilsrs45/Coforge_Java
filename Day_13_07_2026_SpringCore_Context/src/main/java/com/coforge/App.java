package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.bean.Company;
import com.coforge.bean.Laptop;
import com.coforge.bean.Programmer;
import com.coforge.config.SpringConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
//        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//        
//       Programmer p= (Programmer) context.getBean("prg");
//       
//       System.out.println(p);
//        
//        ApplicationContext context=new ClassPathXmlApplicationContext("company.xml");
//        Company c=(Company) context.getBean("comp");
//        System.out.println(c);
        
        
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Laptop l1=(Laptop) context.getBean("lap");
        System.out.println(l1);
    }
}
