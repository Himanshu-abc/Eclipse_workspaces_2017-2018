<%@page import="java.util.List"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
<%@page import="org.hibernate.Query"%>
<%@page import="java.io.*" %>
<%@page import="org.hibernate.Session"%>
<%@page import="com.pp.bean.Employee"%>
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

String sf = request.getParameter("field");
String v= request.getParameter("value");

Configuration cfg=new Configuration();
cfg.configure();
SessionFactory sf1 = cfg.buildSessionFactory();
Session gsession = sf1.openSession();

String one="id";
String two="name";
String three="city";
String four="salary";
String five="email";

if(sf.equals(one)){
	int id=Integer.parseInt(v);
	String hql="from Employee where emp_Id= :id";
	Query q=gsession.createQuery(hql);
	q.setParameter("id", id);
	List <Employee>l1=q.list();
	request.setAttribute("elist1",l1);
}
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
if(sf.equals(two)){
	/* int id=Integer.parseInt(v); */
	String hql="from Employee where emp_name= :name";
	Query q=gsession.createQuery(hql);
	q.setParameter("name", v);
	List <Employee>l2=q.list();
	request.setAttribute("elist2",l2);
}
%>
<c:if test="${not empty elist2}" >
  <table border="1">
  <tr>
	<th>Sr.no</th>
	<th>Employee id</th>
	<th>Employee name</th>
	<th>Employee city</th>
	<th>Employee salary</th>
	<th>Employee Email</th>
	</tr>
	<c:forEach var="e" items="${elist2}" varStatus="s">
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
if(sf.equals(three)){
	
	String hql="from Employee where emp_city= :city";
	Query q=gsession.createQuery(hql);
	q.setParameter("city", v);
	List <Employee>l3=q.list();
	request.setAttribute("elist3",l3);
}
%>
<c:if test="${not empty elist3}" >
  <table border="1">
  <tr>
	<th>Sr.no</th>
	<th>Employee id</th>
	<th>Employee name</th>
	<th>Employee city</th>
	<th>Employee salary</th>
	<th>Employee Email</th>
	</tr>
	<c:forEach var="e" items="${elist3}" varStatus="s">
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
if(sf.equals(five)){
	String hql="from Employee where emp_email= :email";
	Query q=gsession.createQuery(hql);
	q.setParameter("email", v);
	List <Employee>l5=q.list();
	request.setAttribute("elist5",l5);
}
%>
<c:if test="${not empty elist5}" >
  <table border="1">
  <tr>
	<th>Sr.no</th>
	<th>Employee id</th>
	<th>Employee name</th>
	<th>Employee city</th>
	<th>Employee salary</th>
	<th>Employee Email</th>
	</tr>
	<c:forEach var="e" items="${elist5}" varStatus="s">
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
if(sf.equals(four)){
	
	Double db=Double.parseDouble(v);
	String cn=request.getParameter("condition");
	
	String a="=";
	String b="<";
	String c=">";
	String d=">=";
	String e="<=";
	
   if(cn.equals(a)){
	
	String hql="from Employee where emp_salary= :salary";
	Query q=gsession.createQuery(hql);
	q.setParameter("salary", db);
	List <Employee>l4=q.list();
	request.setAttribute("elist4",l4);
      
   }  
%>
<c:if test="${not empty elist4}" >
  <table border="1">
  <tr>
	<th>Sr.no</th>
	<th>Employee id</th>
	<th>Employee name</th>
	<th>Employee city</th>
	<th>Employee salary</th>
	<th>Employee Email</th>
	</tr>
	<c:forEach var="e" items="${elist4}" varStatus="s">
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
if(cn.equals(b)){
	
	String hql="from Employee where emp_salary< :salary";
	Query q=gsession.createQuery(hql);
	q.setParameter("salary", db);
	List <Employee>l4b=q.list();
	request.setAttribute("elist4b",l4b);
}
%>

<c:if test="${not empty elist4b}" >
  <table border="1">
  <tr>
	<th>Sr.no</th>
	<th>Employee id</th>
	<th>Employee name</th>
	<th>Employee city</th>
	<th>Employee salary</th>
	<th>Employee Email</th>
	</tr>
	<c:forEach var="e" items="${elist4b}" varStatus="s">
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

if(cn.equals(c)){
	
	String hql="from Employee where emp_salary> :salary";
	Query q=gsession.createQuery(hql);
	q.setParameter("salary", db);
	List <Employee>l4c=q.list();
	request.setAttribute("elist4c",l4c);
}

%>

<c:if test="${not empty elist4c}" >
  <table border="1">
  <tr>
	<th>Sr.no</th>
	<th>Employee id</th>
	<th>Employee name</th>
	<th>Employee city</th>
	<th>Employee salary</th>
	<th>Employee Email</th>
	</tr>
	<c:forEach var="e" items="${elist4c}" varStatus="s">
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
if(cn.equals(d)){
	
	String hql="from Employee where emp_salary >= :salary";
	Query q=gsession.createQuery(hql);
	q.setParameter("salary", db);
	List <Employee>l4d=q.list();
	request.setAttribute("elist4d",l4d);
}

%>

<c:if test="${not empty elist4d}" >
  <table border="1">
  <tr>
	<th>Sr.no</th>
	<th>Employee id</th>
	<th>Employee name</th>
	<th>Employee city</th>
	<th>Employee salary</th>
	<th>Employee Email</th>
	</tr>
	<c:forEach var="e" items="${elist4d}" varStatus="s">
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
if(cn.equals(e)){
	
	String hql="from Employee where emp_salary<= :salary";
	Query q=gsession.createQuery(hql);
	q.setParameter("salary", db);
	List <Employee>l4e=q.list();
	request.setAttribute("elist4e",l4e);
}
}
%>
<c:if test="${not empty elist4e}" >
  <table border="1">
  <tr>
	<th>Sr.no</th>
	<th>Employee id</th>
	<th>Employee name</th>
	<th>Employee city</th>
	<th>Employee salary</th>
	<th>Employee Email</th>
	</tr>
	<c:forEach var="e" items="${elist4e}" varStatus="s">
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

</body>
</html>