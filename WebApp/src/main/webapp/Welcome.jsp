<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String user = request.getParameter("username");
%>
<h2>Hi, <%=user%></h2>
<h2>Welcome to Accenture! ${100+200} ${200 > 100 }</h2>
</body>
</html>