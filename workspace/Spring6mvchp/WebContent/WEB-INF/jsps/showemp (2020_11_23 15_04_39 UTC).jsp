<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <img src="static/images/527.jpg" width="20%" height="20%"><br><br>
<a href="e_reg">add employee</a><br><br>
<c:if test="${not empty elist}" >
    <table border="1">
    <tr>
  	<th>Sr.no</th>
  	<th>Employee id</th>
  	<th>Employee name</th>
  	<th>Employee Password</th>
  	<th>Employee salary</th>
  	<th>Employee Hobbies</th>
  	<th>Action</th>
  
  	</tr>
  	<c:forEach var="emp" items="${elist}" varStatus="s">
  	<tr>
  	    <td>${s.count }</td>
  	    <td>${emp.empid }</td>
  		<td>${emp.name}</td>
  		<td>${emp.password}</td>
  		<td>${emp.salary}</td>
  		<td>${emp.hobbies}</td>
  		<td> 
			<c:url value="delete" var="d">
				<c:param name="empid" value="${emp.empid}"></c:param>
			</c:url>
			<a href="${d}">delete</a> 
		
		    <c:url value="update" var="upd">
		    <c:param name="empid" value="${emp.empid}"></c:param>
		    </c:url>
		    <a href="${upd}">update</a>
		    </td>
  </tr>
  </c:forEach>
  </table>
  </c:if>
  <c:if test="${empty elist}">
  No Data Found
  </c:if>
   

</body>
</html>