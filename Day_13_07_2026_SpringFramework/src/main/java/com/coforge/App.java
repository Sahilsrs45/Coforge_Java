package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.beans.Hello;
import com.coforge.beans.Item;
import com.coforge.beans.Order;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
//    	ApplicationContext a =new ClassPathXmlApplicationContext("bean.xml");
//    	
//    	Hello h=(Hello) a.getBean("hello");
//    	h.sayHello();
    	
    	//ApplicationContext context=new ClassPathXmlApplicationContext("item_bean.xml");
//    	Item i=(Item) context.getBean("i1");
//    	System.out.println(i);
//    	
//    	Item i1=(Item) context.getBean("i2");
//    	System.out.println(i1);\
    	
    	//Item i=(Item) context.getBean("items");
    	ApplicationContext context=new ClassPathXmlApplicationContext("order.xml");
    	Order o=(Order) context.getBean("order1");
    	System.out.println(o);
    	
        
    }
}
