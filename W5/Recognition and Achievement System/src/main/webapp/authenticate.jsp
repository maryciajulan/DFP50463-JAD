<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String username;
String password;
String errorMessage = "";
username = request.getParameter("username");
password = request.getParameter("password");

if ("marycia".equals(username) && "marycia@pmu".equals(password)) {
	response.sendRedirect("index.jsp");
} else {
	errorMessage = "Invalid Username or Password";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recognition and Achievement | Authentication</title>
</head>
<body>
<% if(errorMessage!=""){ %>
<p><%= errorMessage %></p>
<%}%>
<a href="login.jsp">Try login again</a>
</body>
</html>