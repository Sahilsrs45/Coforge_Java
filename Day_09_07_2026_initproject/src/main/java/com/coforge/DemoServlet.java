package com.coforge;
 
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
/**
* Servlet implementation class DemoServlet
*/
//@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  //  String url,userName,pwd;
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
//		 url=getInitParameter("url");
//		 userName=getInitParameter("username");
//		 pwd=getInitParameter("password");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");


		ServletContext context=request.getServletContext();
	    String url=context.getInitParameter("url");
	    String userName=context.getInitParameter("username");
	    String pwd=context.getInitParameter("password");
		
	    //for manual configuration
	   ServletConfig config=getServletConfig();
	   String servletName=config.getInitParameter("servletName");
	    
		
		out.println("<html><body>");
		out.println("<h1>"+servletName+"</h1>");

		out.println("<h2>MySQL Database Configuration</h2>");

		out.println("MySQL URL : " + url + "<br>");
		out.println("MySQL Username : " + userName + "<br>");
		out.println("MySQL Password : " + pwd + "<br>");

		out.println("</body></html>");

		out.close();
	}
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
 
}