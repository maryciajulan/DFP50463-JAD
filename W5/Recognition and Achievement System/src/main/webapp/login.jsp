<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recognition and Achievement | login </title>
</head>
<body>
	<h2>User Login</h2>
		<form action="authenticate.jsp" method="POST">
			<p>Username: <input type="text" name="username" required/></p>
			<p>Password: <input type="password" name="password"required /></p>
			<p><input type="submit" value="login"/></p>
		</form>
</body>
</html>