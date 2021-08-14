<%@page import="jsp_practise4.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Expression language : ${param.name}

<jsp:useBean id="e1" class="jsp_practise4.Employee" scope="request" type="jsp_practise4.Employee">
</jsp:useBean>

<jsp:getProperty property="id" name="e1"/>
<jsp:getProperty property="name" name="e1"/>

</body>
</html>