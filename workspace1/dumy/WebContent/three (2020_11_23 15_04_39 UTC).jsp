<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

welcome ${sessionScope.obj.name}

<jsp:useBean id="obj" class="dumy.Employee" scope="session"></jsp:useBean>

<jsp:getProperty property="id" name="obj"/>
<jsp:getProperty property="name" name="obj"/>
<jsp:getProperty property="age" name="obj"/>

<% out.println("page three"); %>

</body>
</html>