<%@page import="com.pp.bean.Employee"%>
<%@page import="org.hibernate.Query"%>
<%@page import="java.io.*" %>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

Configuration cfg = new Configuration();
   cfg.configure();
   SessionFactory sf1=cfg.buildSessionFactory();
   Session gsession = sf1.openSession();
   Query q = gsession.createQuery("from Employee");
   List <Employee>l=q.list();
   request.setAttribute("elist",l);
  %>
  <c:if test="${not empty elist}" >
  <table border="1">
  <tr>
	<th>Sr.no</th>
	<th>Employee id</th>
	<th>Employee name</th>
	<th>Employee city</th>
	<th>Employee salary</th>
	<th>Employee Email</th>
	<th>Action</th>
	</tr>
	<c:forEach var="e" items="${elist}" varStatus="s">
	<tr>
	    <td>${s.count }</td>
	    <td>${e.id }</td>
		<td>${e.name}</td>
		<td>${e.city}</td>
		<td>${e.salary}</td>
		<td>${e.email}</td>
		<td> 
			<c:url value="delete.jsp" var="u">
				<c:param name="id" value="${e.id}"></c:param>
			</c:url>
			<a href="${u}">delete</a> 
		
		    <c:url value="update0.jsp" var="update">
		    <c:param name="id" value="${e.id}"></c:param>
		    </c:url>
		    <a href="${update}">update</a>
		    </td>
</tr>
</c:forEach>
</table>
</c:if>
<c:if test="${empty elist}">
No Data Found
</c:if>
   <%
   gsession.close();
   sf1.close(); 
%>


		</body>
</html>