<html>
<body>
<h2><%= "Hello World!" %></h2>
<form action="AppCountServlet">
<button type="submit">Visit App</button>
</form>

<%Object count=application.getAttribute("count");
if(count!=null)
%>
<h3>Total count:<%=count %></h3>
</body>
</html>
