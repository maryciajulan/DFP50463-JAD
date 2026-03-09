<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PMIS | Login</title>
</head>
<body>
	<%
	String error = request.getParameter("error");
	%>
	<h2>Login Page</h2>
	<%
	if ((error) != null && (error).equals("1")) {%>
	<p style="color: red;">Invalid Username or Password</p>
	<%} %>

	<form action="loginProcess.jsp" method="post">
		<p>Username: <input type="text" name="username" required /></p>
		<p>Password: <input type="password" name="password" required /></p>
		<p><input type="submit" value="login" /></p>
	</form>
</body>
</html>