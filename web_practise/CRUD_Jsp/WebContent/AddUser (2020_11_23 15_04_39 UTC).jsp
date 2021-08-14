<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<a href="ViewUser">View Users</a><hr>
<h1>Add New User</h1>
<form action="AddUser2.jsp" method="post">
<table>
<tr><td>Name</td><td><input type="text" name="name"></td></tr>

<tr><td>Email</td><td><input type="text" name="email"></td></tr>

<tr><td>Pass</td><td><input type="password" name="password"></td></tr>

<tr><td></td><td><input type="submit" value="add"></td></tr>
</table>
</form>
</body>
</html>