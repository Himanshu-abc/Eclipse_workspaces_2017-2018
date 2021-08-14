<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<%@ page info="composed by Himanshu Patidar" %>
<%@ include file="header.html" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>new jsp</title>
</head>
<body>
<%

String n=request.getParameter("name");
String c=request.getParameter("city");

session.setAttribute("name", n);
%>
<a href="newjsp2.jsp">go</a>
<%

%>
<%= "welcome "+n+" in "+c %><br>
<%= new Date() %><br><br>
<%= new String("directly created string") %><br><br>
</body>
</html>