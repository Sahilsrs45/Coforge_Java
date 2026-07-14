package com.coforge.Day_14_07_2026_BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.Day_14_07_2026_BeanLifeCycle.Beans.HelloBean;
import com.coforge.Day_14_07_2026_BeanLifeCycle.Config.BeanConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(BeanConfig.class);
        HelloBean h=context.getBean(HelloBean.class);
        h.sayHello();
        context.close();
    }
}
