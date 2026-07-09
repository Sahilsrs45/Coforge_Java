package com.coforge.servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.coforge.model.Customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CustomerDetailsServlet
 */
@WebServlet(name = "CustomerDetailsServlet", urlPatterns = { "/CustomerDetailsServlet" })
public class CustomerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CustomerDetailsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 ArrayList<Customer> customers = new ArrayList<>();

	        customers.add(new Customer(101, "Rahul", "Pune"));
	        customers.add(new Customer(102, "Priya", "Mumbai"));
	        customers.add(new Customer(103, "Amit", "Delhi"));
	        customers.add(new Customer(104, "Sneha", "Bangalore"));
	        customers.add(new Customer(105, "Karan", "Hyderabad"));
	        customers.add(new Customer(106, "Neha", "Chennai"));
	        customers.add(new Customer(107, "Rohit", "Nagpur"));
	        customers.add(new Customer(108, "Anjali", "Nashik"));
	        customers.add(new Customer(109, "Vikas", "Jaipur"));
	        customers.add(new Customer(110, "Pooja", "Kolkata"));
	        
	        RequestDispatcher rd=request.getRequestDispatcher("details.jsp");
	        request.setAttribute("customers", customers);
	        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
