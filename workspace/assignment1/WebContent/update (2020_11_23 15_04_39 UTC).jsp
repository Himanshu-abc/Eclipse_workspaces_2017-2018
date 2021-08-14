<%@page import="org.hibernate.Query"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
<%@page import="com.pp.bean.Employee"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.pp.bean.Employee" %>
<%@page import="java.*" %>
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
 <jsp:setProperty property="id" name="emp"/>
 
<% 
/* int id=Integer.parseInt(request.getParameter("id")); */

Configuration cfg=new Configuration();
cfg.configure();

SessionFactory sf=cfg.buildSessionFactory();
Session sess=sf.openSession();
sess.beginTransaction(); 
 
int idee=(Integer)session.getAttribute("id");
String name = request.getParameter("name");
String city = request.getParameter("city");
Double salary = Double.parseDouble(request.getParameter("salary"));
String email = request.getParameter("email");
String hql="update Employee set emp_name = :n, emp_city = :c ,emp_salary = :s ,emp_email = :em " + "where emp_id = :id";
Query q = sess.createQuery(hql);
q.setParameter("n", name);
q.setParameter("c", city);
q.setParameter("s", salary);
q.setParameter("em", email);
q.setParameter("id",idee);

q.executeUpdate();
sess.getTransaction().commit();  
sess.close();
sf.close();
response.sendRedirect("get.jsp");
%>
</body>
</html>