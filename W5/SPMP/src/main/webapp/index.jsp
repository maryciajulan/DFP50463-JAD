<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String username = (String) session.getAttribute("namaPengguna");
    Boolean loggedIn = (Boolean) session.getAttribute("sudahLogin");
    
    if (loggedIn == null || !loggedIn) {
    	response.sendRedirect("login.jsp");
    }
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SPMP | LANDING PAGE </title>
</head>
<body>
<h1>Selamat Datang, <%= username %> ! </h1>
<a href= "LogOutServlet">Logout</a>
</body>
</html>