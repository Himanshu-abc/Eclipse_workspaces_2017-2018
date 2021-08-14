<%@page import="com.app.dao.EmployeeDao"%>
<%@page import="com.app.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="New.jsp">Add New Employee</a><br><br>

<%
List<Employee> list=EmployeeDao.viewAll();
request.setAttribute("list",list);
%>

<table border="1" width="90%"  cellpadding="1" align="center" bgcolor="lightgreen" >
<tr><th>Name</th> <th>password</th>  <th>email</th> <th>sex</th> <th>country</th> <th>edit</th> <th>delete </th> </tr>

<c:forEach items="${list}" var="ee">

<tr> <td>${ee.getName()}</td> <td>${ee.getPassword()}</td>  <td>${ee.getEmail()}</td> <td>${ee.getSex()}</td>
 <td>${ee.getCountry()}</td>  <td><a href="update.jsp?name=${ee.getName()}">update</a></td>  
 <td><a href="delete.jsp?name=${ee.getName()}">delete</a></td> </tr> 

</c:forEach>

</table>

</body>
</html>