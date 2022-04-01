<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success.jsp</title>
</head>
<body>
<h1>Welcome to velocity</h1>
<%String name=(String)request.getAttribute("data"); %>
<%out.print("your user name is="+name); %>
</body>
</html>