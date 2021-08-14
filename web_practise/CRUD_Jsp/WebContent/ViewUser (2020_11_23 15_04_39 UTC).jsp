<%@page import="com.xyz.dao.User"%>
<%@page import="java.util.List"%>
<%@page import="com.xyz.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ViewUser</title>
</head>
<body>
<a href="AddUser.jsp">Add User</a><br>

<%
UserDao ud=new UserDao();
List<User> list=ud.getUsers();
request.setAttribute("list",list);
%>

<table border="1" width="90%">
<tr><th>Name</th><th>Email</th><th>Password</th><th>Update</th><th>Delete</th></tr>

<c:forEach items="${list}" var="u">
<tr>
<td>${u.getName()}</td>
<td>${u.getEmail()}</td>
<td>${u.getPassword()}</td>
<td><a href="update.jsp?name=${u.getName()}">update</a></td>
<td><a href="delete.jsp?name=${u.getName()}">delete</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>