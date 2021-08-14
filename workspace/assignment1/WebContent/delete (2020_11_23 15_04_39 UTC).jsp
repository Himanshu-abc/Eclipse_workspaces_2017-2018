<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
<%@page import="com.pp.bean.Employee"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="emp" class="com.pp.bean.Employee"/>
 <jsp:setProperty property="id" name="emp"/>

<% 

Configuration cfg=new Configuration();
cfg.configure();
SessionFactory sf=cfg.buildSessionFactory();
Session sess=sf.openSession();
String hql = "delete from Employee where emp_Id= :id"; 
Query q= sess.createQuery(hql);
q.setParameter("id",emp.getId());
q.executeUpdate();
sess.close();
sf.close();
response.sendRedirect("get.jsp");

%>
 
</body>
</html>