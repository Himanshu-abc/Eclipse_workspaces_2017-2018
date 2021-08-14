
<%@page import="com.pp.bean.Employee"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
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
<jsp:useBean id="emp" class="com.pp.bean.Employee"/>
<jsp:setProperty property="*" name="emp"/>
<%
int sr= Integer.parseInt(request.getParameter("srow"));
int tr=Integer.parseInt(request.getParameter("trow"));

Configuration cfg=new Configuration();
cfg.configure();
SessionFactory sf1 = cfg.buildSessionFactory();
Session gsession = sf1.openSession();

String hql="from Employee";
Query q=gsession.createQuery(hql);
q.setFirstResult(sr);
q.setMaxResults(tr);

List <Employee> el=q.list();
request.setAttribute("elist1",el);
%>

<c:if test="${not empty elist1}" >
  <table border="1">
  <tr>
	<th>Sr.no</th>
	<th>Employee id</th>
	<th>Employee name</th>
	<th>Employee city</th>
	<th>Employee salary</th>
	<th>Employee Email</th>
	</tr>
	<c:forEach var="e" items="${elist1}" varStatus="s">
	<tr>
	    <td>${s.count }</td>
	    <td>${e.id }</td>
		<td>${e.name}</td>
		<td>${e.city}</td>
		<td>${e.salary}</td>
		<td>${e.email}</td>
		
</tr>
</c:forEach>
</table>
</c:if>
<%
gsession.close();
sf1.close(); 
%>
</body>
</html>