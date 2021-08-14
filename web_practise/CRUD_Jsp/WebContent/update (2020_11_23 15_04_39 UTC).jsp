<%@page import="com.xyz.dao.User"%>
<%@page import="com.xyz.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
<%
String name=request.getParameter("name");
UserDao ud=new UserDao();
User u=ud.getByName(name);
request.setAttribute("u",u);
%>
<h1>Update User</h1>
<form action="update2.jsp" method="post">
<table border="1" width="90%">
<tr><td>Name</td><td><input type="hidden" name="name" value="${u.getName()}"></td></tr>
<tr><td>Email</td><td><input type="text" name="email" value="${u.getEmail()}"></td></tr>
<tr><td>password</td><td><input type="password" name="password" value="${u.getPassword()}"></td></tr>
<tr><td></td><td><input type="submit" value="update"></td></tr>
</table>
</form>
</body>
</html>