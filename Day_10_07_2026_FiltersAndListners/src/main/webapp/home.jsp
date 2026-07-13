<%@page import="jakarta.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%HttpSession session1=request.getSession(false); 


if(session1!=null){
  String uname=(String)session1.getAttribute("uname");
  out.println("Welcome........."+uname);

%>



<a href="LogoutServlet">Logout</a>

<%


}
else{
	response.sendRedirect("index.jsp");
	
}

%>


</body>
</html>