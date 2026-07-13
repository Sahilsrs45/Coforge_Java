package com.coforge.listeners;

import java.awt.Event;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppContextListener
 *
 */
@WebListener
public class AppContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public AppContextListener() {
        // TODO Auto-generated constructor stub
    }
	
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    	// TODO Auto-generated method stub
    	//ServletContextListener.super.contextInitialized(sce);
    	ServletContext context=sce.getServletContext();
    	context.setAttribute("count", 0);
    	context.log("Application started");
    	System.out.println("Application started");
    	//context.log("number of hits : "+count);
    	
    }
    
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    	// TODO Auto-generated method stub
    	//ServletContextListener.super.contextDestroyed(sce);
    	ServletContext context=sce.getServletContext();
    	Object count=context.getAttribute("count");
    	context.log("Application Stopped");
    	context.log("number of hits : "+count);
    	
    	System.out.println("Application stopped and number of hits are : "+count );
    	
    }
    
}
