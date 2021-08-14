<%@page import="com.app.bean.Employee"%>
<%@page import="com.app.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String name=request.getParameter("name");
Employee e=EmployeeDao.getbyName(name);
%>
<form action="update2.jsp" method="post">
<input type="hidden" name="name" value="<%=e.getName()%>">
<table align="center" border="1" cellpadding="1" bgcolor="lightgreen" width="50%" >

<tr><td>password : </td> <td><input type="password" name="password" value="<%=e.getPassword()%>"></td></tr>
<tr><td>Email : </td> <td><input type="text" name="email" value="<%=e.getEmail()%>"></td></tr>
<tr><td>Sex : </td> <td><input type="radio" name="sex" value="male">male
               <input type="radio" name="sex" value="female">female</td></tr>
<tr><td>Country : </td>
<td><select name="country">
<option>India</option>
<option>Russia</option>
<option>America</option>
<option>China</option>
<option>Lebanon</option>
</select> </td>
</tr>
<tr><td><input type="submit" value="save"></td></tr>
<tr><td><input type="reset" value="reset"></td></tr>
</table>
</form>
</body>
</html>