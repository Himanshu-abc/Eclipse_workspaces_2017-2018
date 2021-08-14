<%@page import="com.student.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>

<jsp:useBean id="st1" class="com.student.Student" scope="session" ></jsp:useBean>

<jsp:getProperty property="id" name="st1"/>
<jsp:getProperty property="name" name="st1"/>

</body>
</html>