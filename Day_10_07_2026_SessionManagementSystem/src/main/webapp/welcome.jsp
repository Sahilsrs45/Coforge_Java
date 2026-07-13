<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<%
HttpSession session1 = request.getSession(false);

if(session1 != null && session1.getAttribute("email") != null){

    String email = (String)session1.getAttribute("email");
%>

<h2>Welcome User with email: <%= email %></h2>

<a href="LogoutServlet">Logout</a>

<%
}
else{
    response.sendRedirect("login.jsp");
}
%>

</body>
</html>