<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%out.println("This is a jsp page using scriptlet"); %>
<%! int a=4,b=8;       /* jsp declaration */
%>
<%= a*b %><!-- jsp scriptlet -->
</body>
</html>